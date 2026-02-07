class Solution {
    public int minInsertions(String s) {
       int n = s.length();
       String p = new StringBuilder(s).reverse().toString();
       return n-L_cs(s,p); 
    }
    public int L_cs(String s,String p){
        int m = s.length();
        int n = p.length();
        int[][] t = new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==p.charAt(j-1))t[i][j] = 1+t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[m][n];
    }
}