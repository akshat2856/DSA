class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        int n = nums.length;
        boolean decreasing = true;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1])decreasing = false;
            if(nums[i]>nums[i+1])increasing = false;
        }
        return increasing || decreasing;
    }
}