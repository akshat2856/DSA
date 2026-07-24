class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
         int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(solve(nums,n-2,0,dp1),solve(nums,n-1,1,dp2));
    }
    public int solve(int[] nums,int i,int start,int[] dp){
        if(i<start)return 0;
        if(dp[i]!=-1)return dp[i];
        int pick = nums[i] + solve(nums,i-2,start,dp);
        int notpick = 0 + solve(nums,i-1,start,dp);
        return dp[i] = Math.max(pick,notpick);
    }
}