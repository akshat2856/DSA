class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1){

        }
        List<Integer> ans = new ArrayList<Integer>();
        if(edges.length==0){
            ans.add(0);
            return ans;
        }
        int[] indegree = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int j =0;
        // for(int idx :adj.get(j)){
        //     indegree[]
        //     indegree[idx]++;
        //     j++;
        // }
        for(int i=0;i<edges.length;i++){
            indegree[edges[i][0]]++;
            indegree[edges[i][1]]++;
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==1)que.add(i);
        }
        while(n>2){
           // if(indegree[que.peek()]==1)break;
            int size = que.size();
            n-=size;
            
            for(int i=0;i<size;i++){
            int val = que.poll();
           // indegree[val]--;
            for(int idx : adj.get(val)){
                indegree[idx]--;
                if(indegree[idx]==1)que.add(idx);
            }
            }
        }
        if(que.size()==1){
            ans.add(que.poll());
        }
        else{
            ans.add(que.poll());
            ans.add(que.poll());
        }
        return ans;
    }
}