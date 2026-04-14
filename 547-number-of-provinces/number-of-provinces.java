class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
          if(!vis[i]) {
             dfs(i,vis,n,isConnected);
            count++;
          }
        }
        return count;
    }
    public void dfs(int node,boolean[] vis,int n,int[][] isConnected){
        vis[node] = true;
        for(int i=0;i<n;i++){
            if(isConnected[node][i]==1 && !vis[i]){
                dfs(i,vis,n,isConnected);
            }
        }
    }
}