class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj.get(u).add(v);
        }
        int[] indegree = new int[numCourses];
        int cntt = 0;
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)que.add(i);
        }
        while(!que.isEmpty()){
            int node = que.poll();
            cntt++;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)que.add(it);
            }
        }
        return cntt==numCourses;
    }
}