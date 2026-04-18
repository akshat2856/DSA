class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] answer = new int[m][n];
        Queue<Pair> que = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
               if(mat[i][j]==0){
                 que.add(new Pair(i,j));
                 vis[i][j] = true;
               }
            }
        }
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        while(!que.isEmpty()){
            Pair front = que.poll();
            int row = front.row;
            int col = front.col;
            for(int k=0;k<4;k++){
                int nr = row + dr[k];
                int nc = col + dc[k];
                if(nr>=0 && nr<m && nc>=0 && nc<n && !vis[nr][nc]){
                    vis[nr][nc] = true;
                    answer[nr][nc] = answer[row][col] + 1;
                    que.add(new Pair(nr,nc));
                }
            }
        }
       return answer;
        }
    }
        // public void bfs(int[][] mat,int[][] answer,int i,int j){
        //     int m = mat.length;
        //     int n = mat[0].length;
        //     boolean[][] vis = new boolean[m][n];
        //   Queue<Pair> que = new LinkedList<>();
        //   que.add(new Pair(i,j,0));
        //   vis[i][j] = true;
        //   while(!que.isEmpty()){
        //     Pair front = que.poll();
        //     int row = front.row;
        //     int col = front.col;
        //     int dist = front.dist;
        //     if(mat[row][col]==0){
        //         answer[i][j] = dist;
        //         break;
        //     }
        //     int[] dr = {-1,1,0,0};
        //     int[] dc = {0,0,-1,1};
        //     for(int k=0;k<4;k++){
        //         int nr = row + dr[k];
        //         int nc = col + dc[k];
        //         if(nr>=0&&nr<m&&nc>=0&&nc<n&&!vis[nr][nc]){
        //           vis[nr][nc] = true;
        //           que.add(new Pair(nr,nc,dist+1));
        //         }
        //     }
        //   }
        // }
