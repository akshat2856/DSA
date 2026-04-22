class Solution {
    public List<Integer> eventualSafeNodes(int[][] edges) {
        int V = edges.length;
        ArrayList<Integer> answer = new ArrayList<>();
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i=0;i<edges.length;i++){
    adj.add(new ArrayList<>());
    for(int node : edges[i]){
        adj.get(i).add(node);
    }
}
        int[] vis = new int[V];
        int[] pathvis = new int[V];
        // int[] terminal = new int[V];
        // for (int i = 0; i < edges.length; i++) {
        //     if (edges[i].length == 0) {
        //      terminal[i] = 1;
        //     }
        // }
        for(int i=0;i<V;i++){
            // if(vis[i]==0){
            if(dfs(i,adj,vis,pathvis)==true)continue;
            if(dfs(i,adj,vis,pathvis)==false ){answer.add(i);
            //     for(int k=0;k<V;k++){
            //         if(terminal[k]==1){
            //             answer.add(i);
            //             break;
            //         }
            //     // }
            // }
            }
        }
        return answer;
    }
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] pathvis){
        vis[node] = 1;
        pathvis[node] = 1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
            if(dfs(it,adj,vis,pathvis)==true)return true;
            }
            else if(pathvis[it]==1)return true;
        }
        pathvis[node] = 0;
        return false;
    }
}