class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        return m+n-(2*L_cs(word1,word2,m,n));
    }
    public int L_cs(String s,String p,int m,int n){
        int[][] t = new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==p.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
}