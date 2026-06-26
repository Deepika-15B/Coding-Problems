class Solution {
    public void dfs(char[][]grid,int r,int c)
    {
        int row = grid.length;
        int col = grid[0].length;

        if(r<0||c<0||r>=row||c>=col||grid[r][c]!='1')
             return;

        grid[r][c] = '0';

        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);

    }
    public int numIslands(char[][] grid) {
       int  m = grid.length;
        int n = grid[0].length;
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna