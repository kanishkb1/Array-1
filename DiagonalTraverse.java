//Approach:  We will use flg to change the directiopn of traversing, updating indices on boundary conditions. 
//TC: O(M*N)
//SC: O(M*N)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, j = 0;
        boolean dir = true;
        int[] result = new int[m * n];
        int idx = 0;

        for (idx = 0; idx < result.length; idx++) {
            result[idx] = mat[i][j];

            // Traverse in UP-direction
            if (dir == true) {
                if (i == 0 && j == n - 1) {
                    j++;
                    dir = false;
                } else if (j == n - 1) {
                    i++;
                    dir = false;
                } else {
                    i--;
                    j++;
                }

            }
            // Traverse in downward direction
            else {
                if (j == 0 && i == m - 1) {
                    i--;
                    dir = true;
                } else if (i == m - 1) {
                    j++;
                    dir = true;
                } else {
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}
