class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        solve(0,vis,rooms);
        for(int i=0;i<n;i++){
            if(vis[i]==false)return false;
        }
        return true;
    }
    public void solve(int i , boolean[] vis,List<List<Integer>> rooms){
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;
        while(!q.isEmpty()){
            int current = q.poll();
            for(int key : rooms.get(current)){
                if(!vis[key]){
                    vis[key] = true;
                    q.add(key);
                }
            }
        }
    }
}