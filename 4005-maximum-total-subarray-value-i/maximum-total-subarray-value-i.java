class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        return (max-min)*k;
    }
}