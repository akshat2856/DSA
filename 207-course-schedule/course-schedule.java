class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            int start = pre[0];
            int end = pre[1];
            adj.get(end).add(start);
        }
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int neig : adj.get(i)){
                indegree[neig]++;
            }
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)que.offer(i);
        }
        int count = 0;
        while(!que.isEmpty()){
            int node = que.poll();
            count++;
            for(int neig : adj.get(node)){
                indegree[neig]--;
                if(indegree[neig]==0)que.offer(neig);
            }
        }
        return count==numCourses;
    }
}