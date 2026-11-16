class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(c>=0 && r<matrix.length)
        {
            if(matrix[r][c]==target) return true;
            else if(target<matrix[r][c])
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna