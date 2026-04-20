class Solution {
    public void solve(char[][] board) {
    int m = board.length;
    int n = board[0].length;
    boolean[][] vis = new boolean[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){if(board[i][j]=='O'){
            if((i==0 || j==0 || i==m-1 || j==n-1) && !vis[i][j])dfs(board,i,j,vis);
        }
      }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(board[i][j]=='O'&&!vis[i][j])board[i][j] = 'X';
        }
      }
    }
    public void dfs(char[][] board,int i,int j,boolean[][] vis){
    int m = board.length;
    int n = board[0].length;
    vis[i][j] = true;
    if(i+1<m && !vis[i+1][j] && board[i+1][j]=='O')dfs(board,i+1,j,vis); 
    if(i-1>=0 && !vis[i-1][j] && board[i-1][j]=='O')dfs(board,i-1,j,vis);
    if(j+1<n && !vis[i][j+1] && board[i][j+1]=='O')dfs(board,i,j+1,vis);
    if(j-1>=0 && !vis[i][j-1] && board[i][j-1]=='O')dfs(board,i,j-1,vis);
    }
}