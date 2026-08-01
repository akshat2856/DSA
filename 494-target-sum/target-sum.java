class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        for(int num : nums){
            sum+=num;
        }
        if(Math.abs(target) > sum)return 0;
        if((target+sum)%2!=0)return 0;
        int newsum = (sum+target)/2;
        int ans = sub(nums,n,newsum);
        return ans;
    }
    public int sub(int[] nums,int n,int newsum){
        int[][] dp = new int[n+1][newsum+1];
        dp[0][0] = 1;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<newsum+1;j++){
                if(nums[i-1]<=j)dp[i][j]=dp[i-1][j-nums[i-1]] + dp[i-1][j];
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][newsum];
    }
}