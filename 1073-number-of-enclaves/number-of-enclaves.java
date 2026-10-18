class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                if((i==0 || i==m-1 || j==0 || j==n-1 ))dfs(grid,i,j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)count++;
            }
        }
        return count;
    }
    public void dfs(int[][] grid,int i,int j){
        int m = grid.length;
        int n = grid[0].length;
        grid[i][j] = 0;
        if(i+1<m && grid[i+1][j]==1)dfs(grid,i+1,j);
        if(i-1>=0 && grid[i-1][j]==1)dfs(grid,i-1,j);
        if(j+1<n && grid[i][j+1]==1)dfs(grid,i,j+1);
        if(j-1>=0 && grid[i][j-1]==1)dfs(grid,i,j-1);
    }
}