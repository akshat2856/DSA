class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a,b)->{
                return b[0]-a[0];
            }
        );
        for(int[] point:points){
            int x = point[0];
            int y = point[1];
            int dist = x*x + y*y;
            maxHeap.add(new int[]{dist,x,y});
            if(maxHeap.size()>k)maxHeap.poll();
        }
        int[][] answ = new int[k][2];
        int i=0;
        while(!maxHeap.isEmpty()){
            int[] curr = maxHeap.poll();
            answ[i][0] = curr[1];
            answ[i][1] = curr[2];
            i++;
        }
        return answ;
    }
}