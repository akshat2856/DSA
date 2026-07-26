class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1)return 0;
         int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++)
{
    dp[i][j]=-1;
}        }

       return solve(0,0,m,n,dp,obstacleGrid);
    }
    public int solve(int i,int j,int m,int n,int[][] dp,int[][] obstacleGrid){
        if(i>=m || j>=n)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==m-1 && j==n-1)return 1;
        int up=0,down=0;
        if(i+1<m &&obstacleGrid[i+1][j]!=1) up = solve(i+1,j,m,n,dp,obstacleGrid);
        if(j+1<n &&obstacleGrid[i][j+1]!=1) down = solve(i,j+1,m,n,dp,obstacleGrid);
        return dp[i][j] = up+down;
    }
}