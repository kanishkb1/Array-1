//Approach: We have used 4 pointers: top, bottom, left and right. 
//Time complexity: O(m*n)
//Space Complexity: O(m*n)

class SparseTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;

       List<Integer> result = new ArrayList<>();
       int top=0, left=0,right = n-1, bottom = m - 1;
       while(left <= right && top<= bottom){
            //top side
            //Loop-> top row from left to right and increments 'top'
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;

            //right wall
            //Loop-> top to bottom and decrements 'right'    
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            //Checks if there are still valid elements to traverse; if not, breaks out of the loop.
            if(left > right || top > bottom){
                break;
            }

            //Loop-> bottom row traverses from right to left and decrements 'bottom'    
            for(int j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;

            //Loop-> leftmost traverses from bottom to top and increments 'left'    
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;           
       }
        return result;
    }
}