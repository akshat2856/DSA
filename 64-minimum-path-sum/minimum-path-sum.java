class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
        Arrays.fill(dp[i], -1);
        }
        return dfs(0,0,grid,dp);
    }

    public int dfs(int i, int j, int[][] grid, int[][] dp) {
        int m = grid.length;
        int n = grid[0].length;
        if (i == m - 1 && j == n - 1) return grid[i][j];
        if (i >= m || j >= n) return Integer.MAX_VALUE;
        if (dp[i][j] != -1)  return dp[i][j];
        int down = dfs(i + 1, j, grid, dp);
        int right = dfs(i, j + 1, grid, dp);
        int ans = Math.min(down, right);
        if (ans == Integer.MAX_VALUE)
            dp[i][j] = Integer.MAX_VALUE;
        else
            dp[i][j] = grid[i][j] + ans;
        return dp[i][j];
    }
}