class Tuple{
    int distance;
    int row;
    int col;
    Tuple(int distance,int row,int col){
        this.distance = distance;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Tuple> pq = new PriorityQueue<>((x,y)->x.distance-y.distance);
        int m = heights.length;
        int n = heights[0].length;
        int[][] dist = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dist[i][j] = (int)1e9;
            }
        }
        dist[0][0] = 0;
        pq.add(new Tuple(0,0,0));
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        while(!pq.isEmpty()){
            Tuple it = pq.poll();
            int diff = it.distance;
            int r = it.row;
            int c = it.col;
            if(r==m-1 && c==n-1)return diff;
            for(int i=0;i<4;i++){
                int newr = r + dr[i];
                int newc = c + dc[i];
                if(newr>=0 && newr<m && newc>=0 && newc<n){
                    int neweffort = Math.max(Math.abs(heights[r][c]-heights[newr][newc]),diff);
                    if(neweffort<dist[newr][newc]){
                        dist[newr][newc] = neweffort;
                        pq.add(new Tuple(neweffort,newr,newc));
                    }
                }
            }
        }
        return 0;
    }
}