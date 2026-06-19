class Solution {
    int count = Integer.MIN_VALUE;
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(!visited[i][j] && grid[i][j]==1){
                int area = dfs(grid,visited,i,j);
                maxArea=Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,boolean[][] visited,int i,int j){
        visited[i][j] = true;
        int m = grid.length;
        int n = grid[0].length;
        int area = 1;
        if (i + 1 < m && grid[i + 1][j] == 1 && !visited[i + 1][j])
            area += dfs(grid, visited, i + 1, j);
        if (i - 1 >= 0 && grid[i - 1][j] == 1 && !visited[i - 1][j])
            area += dfs(grid, visited, i - 1, j);
        if (j + 1 < n && grid[i][j + 1] == 1 && !visited[i][j + 1])
            area += dfs(grid, visited, i, j + 1);
        if (j - 1 >= 0 && grid[i][j - 1] == 1 && !visited[i][j - 1])
            area += dfs(grid, visited, i, j - 1);
        return area;
    }
}