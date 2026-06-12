class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        int len = word.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(""+board[i][j],vis,word,board,i,j)==true)return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(String s,boolean[][] vis,String word,char[][] board,int i,int j){
        int m = board.length;
        int n = board[0].length;
        vis[i][j] = true;
        if(s.length()==word.length()){
            if(s.equals(word)) return true;
        }
        if(s.length() >= word.length()) {
            vis[i][j] = false;
            return false;
        }
        if(i - 1 >= 0 && !vis[i - 1][j]) {
            if(dfs(s + board[i - 1][j], vis, word, board, i - 1, j))
             return true;
        }
        if(i + 1 < m && !vis[i + 1][j]) {
            if(dfs(s + board[i + 1][j], vis, word, board, i + 1, j))
             return true;
        }
        if(j - 1 >= 0 && !vis[i][j - 1]) {
            if(dfs(s + board[i][j - 1], vis, word, board, i, j - 1))
             return true;
        }
        if(j + 1 < n && !vis[i][j + 1]) {
            if(dfs(s + board[i][j + 1], vis, word, board, i, j + 1))
                return true;
        }
        vis[i][j] = false;
        return false;
    }
}