class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)return intervals;
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> answer = new ArrayList<>();
        int[] newintervals = intervals[0];
        answer.add(newintervals);
        for(int[] interval : intervals){
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