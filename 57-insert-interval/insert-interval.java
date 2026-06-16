class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    int m = intervals.length;
    int[][] in = new int[m+1][2];
    for(int i=0;i<m;i++){
        in[i] = intervals[i]; 
    }
        in[m] = newInterval;
    if(in.length<=1)return in;
        Arrays.sort(in,Comparator.comparingInt(i->i[0]));
        List<int[]> answer = new ArrayList<>();
        int[] newintervals = in[0];
        answer.add(newintervals);
        for(int[] interval : in){
            if(interval[0]<= newintervals[1]){
                newintervals[1] = Math.max(newintervals[1],interval[1]);
            }
            else{
                newintervals = interval;
                answer.add(newintervals);
            }
        }
        return answer.toArray(new int[answer.size()][]);
    }
}