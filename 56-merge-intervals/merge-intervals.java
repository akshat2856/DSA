class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1)return intervals;
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        ArrayList<int[]> answer = new ArrayList<>();
        int[] newinterval = intervals[0];
        answer.add(newinterval);
        for(int[] interval : intervals){
            if(interval[0]<=newinterval[1]){
                newinterval[1] = Math.max(interval[1],newinterval[1]);
            }
            else{
                newinterval = interval;
                answer.add(newinterval);
            }
        }
        return answer.toArray(new int[answer.size()][]);
    }
}