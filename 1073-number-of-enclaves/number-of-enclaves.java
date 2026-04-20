class Solution {
    public int numEnclaves(int[][] grid) {
     int m = grid.length;
    int n = grid[0].length;
    int count = 0;
    boolean[][] vis = new boolean[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){if(grid[i][j]==1){
            if((i==0 || j==0 || i==m-1 || j==n-1) && !vis[i][j])dfs(grid,i,j,vis);
        }
      }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1&&!vis[i][j])count++;;
        }
      }
      return count;
    }
    public void dfs(int[][] grid,int i,int j,boolean[][] vis){
    int m = grid.length;
    int n = grid[0].length;
    vis[i][j] = true;
    if(i+1<m && !vis[i+1][j] && grid[i+1][j]==1)dfs(grid,i+1,j,vis); 
    if(i-1>=0 && !vis[i-1][j] && grid[i-1][j]==1)dfs(grid,i-1,j,vis);
    if(j+1<n && !vis[i][j+1] && grid[i][j+1]==1)dfs(grid,i,j+1,vis);
    if(j-1>=0 && !vis[i][j-1] && grid[i][j-1]==1)dfs(grid,i,j-1,vis);
    }
}