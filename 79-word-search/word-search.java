class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,word,vis,i,j,""+word.charAt(0))==true)return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,boolean[][] vis,int i,int j,String check){
        int m = board.length;
        int n = board[0].length;
        if(check.length()==word.length()){
            if(check.equals(word))return true;
        }
        if(check.length()>word.length()){
            vis[i][j] = false;
            return false;
        }
        vis[i][j] = true;
        if(i+1<m && vis[i+1][j]==false){
            if(dfs(board,word,vis,i+1,j,check+board[i+1][j])==true)return true;
        }
        if(i-1>=0 && vis[i-1][j]==false){
            if(dfs(board,word,vis,i-1,j,check+board[i-1][j])==true)return true;
        }
        if(j+1<n && vis[i][j+1]==false){
            if(dfs(board,word,vis,i,j+1,check+board[i][j+1])==true)return true;
        }
        if(j-1>=0 && vis[i][j-1]==false){
            if(dfs(board,word,vis,i,j-1,check+board[i][j-1])==true)return true;
        }
        vis[i][j] = false;
        return false;
    }
}