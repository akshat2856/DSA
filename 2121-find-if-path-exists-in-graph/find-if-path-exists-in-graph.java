class Solution {
    public static class Edge{
        int src,nbr;
        Edge(int src, int nbr){
            this.src = src;
            this.nbr = nbr;
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0 ; i<n ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] e : edges){
int u = e[0];
int v = e[1];
graph[u].add(new Edge(u,v));
graph[v].add(new Edge(v,u));
        }
        boolean[] visited =  new boolean[n];
        return haspathHelper(graph,source,visited,destination);
    }
    public  boolean haspathHelper(ArrayList<Edge>[] graph,int vtx,boolean[] visited,int dest){
        if(vtx==dest)return true;

        visited[vtx] = true;
        for(Edge e : graph[vtx]){
            if(!visited[e.nbr]){
                boolean res = haspathHelper(graph,e.nbr,visited,dest);
                if(res)return true;
            }
        }
        return false;
    }
}