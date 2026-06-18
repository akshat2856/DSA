class Pair{
    int row;
    int col;
    int time;
   public Pair(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
       Queue<Pair> qu = new LinkedList<>();
       int[][] vis = new int[m][n]; 
       int cnt = 0;
       int cntfresh = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(grid[i][j]==2){
                 qu.add(new Pair(i,j,0));
                 vis[i][j] = 2;
               }
               if(grid[i][j]==1)cntfresh++;
            }
        }
            int tm = 0;
            int[] drow = {-1,0,1,0};
            int[] dcol = {0,1,0,-1};
            while(!qu.isEmpty()){
                Pair curr = qu.remove();
                int r = curr.row;
                int c = curr.col;
                int t = curr.time;
                tm = Math.max(t,tm);
                for(int i=0;i<4;i++){
                    int nr = r + drow[i];
                    int nc = c + dcol[i];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && vis[nr][nc]==0 && grid[nr][nc]==1){
                    qu.add(new Pair(nr,nc,t+1));
                    vis[nr][nc]=2;
                    cnt++;
                }
                }
        }
        if(cnt!=cntfresh)return -1;
        return tm;
        }
    }
    