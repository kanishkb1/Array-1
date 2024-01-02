//Brute force: Use two loops to find the product of the elements except current inex; two loops indexes during iterations should never be same.
//TC: O(n*n)
//SC: O(1)

//Optimized approach: Use running product algorithm. Find the product at particular index from left except at that position. Follow the same procedure but from right side (reverse order). Multiply left and right both.
//Space Complexity: O(1)
//Time complexity: O(n)

class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp= 1;
        int [] result = new int[n];

        result[0] = 1;
        //left side product on current i-th index till previous index
        for (int i=1;i<n;i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }

         //right side product on current index starting backwards
        rp = 1;
        for (int i=n-2;i>=0;i--){
            rp = rp * nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}