class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      int m = image.length;
      int n = image[0].length;
      boolean[][] vis = new boolean[m][n];
      dfs(image,sr,sc,color,vis);
      return image;  
    }
    public void dfs(int[][] image, int sr, int sc, int color,boolean[][] vis){
      int m = image.length;
      int n = image[0].length;
      int original = image[sr][sc];  
      image[sr][sc] = color;
      vis[sr][sc] = true;
      if(sr-1>=0 && image[sr-1][sc]==original && !vis[sr-1][sc])dfs(image,sr-1,sc,color,vis);
      if(sr+1<m && image[sr+1][sc]==original && !vis[sr+1][sc])dfs(image,sr+1,sc,color,vis);
      if(sc-1>=0 && image[sr][sc-1]==original && !vis[sr][sc-1])dfs(image,sr,sc-1,color,vis);
      if(sc+1<n && image[sr][sc+1]==original && !vis[sr][sc+1])dfs(image,sr,sc+1,color,vis);
    }
}