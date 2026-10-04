class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        Arrays.sort(nums);
        int count = 1;
        int maxcount = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        for(int i=1;i<list.size();i++){
            if(list.get(i)-list.get(i-1)!=1)count=0;
            count++;
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}