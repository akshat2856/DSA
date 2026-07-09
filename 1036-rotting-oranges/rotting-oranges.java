class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> que = new LinkedList<>();
        int fresh =0;
        int cntfresh = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)que.add(new Pair(i,j,0));
                else if(grid[i][j]==0)continue;
                else fresh++;
            }
        }
        boolean[][] check = new boolean[m][n];
        // int dr = {-1,0,1,0};
        // int dc = {0,-1,0,1};
        int t = 0;
        while(!que.isEmpty()){
        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};
            Pair p = que.remove();
            int r = p.row;
            int c = p.col;
            int tc = p.time;
            t = Math.max(t,tc);
            for(int i=0;i<4;i++){
            int nr = r + dr[i];
            int nc = c +dc[i];
            if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && check[nr][nc]==false){
                que.add(new Pair(nr,nc,tc+1));
                check[nr][nc] = true;
                cntfresh++;
            }
        }
        }
        if(fresh!=cntfresh)return -1;
        else return t;
    }
}