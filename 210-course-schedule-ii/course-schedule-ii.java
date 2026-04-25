class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     int m = prerequisites.length;
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj.get(v).add(u);
        }
        int[] indegree = new int[numCourses];
        int[] answ = new int[numCourses];
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)que.add(i);
        }
        int i=0;
        while(!que.isEmpty()){
            int node = que.poll();
            answ[i++] = node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)que.add(it);
            }
        }
        if(i != numCourses) return new int[0];
        return answ;
    }
}