class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int[] bp = new int[n];
        Arrays.fill(bp,-1);
        int x = solve(nums,n-2,dp);
        int y = solve1(nums,n-1,bp);
        return Math.max(x,y);
    }
    public int solve(int[] nums,int index,int[] dp){
        //if(index==0)return nums[index];
        if(index<0)return 0;
        if(dp[index]!=-1)return dp[index];
        int pick = nums[index] + solve(nums,index-2,dp);
        int notpick = 0 + solve(nums,index-1,dp);
        return dp[index] = Math.max(pick,notpick);
    }
    public int solve1(int[] nums,int index,int[] bp){
        //if(index==0)return nums[index];
        if(index<1)return 0;
       // if (index == 1) return nums[1];
        if(bp[index]!=-1)return bp[index];
        int pick = nums[index] + solve1(nums,index-2,bp);
        int notpick = 0 + solve1(nums,index-1,bp);
        return bp[index] = Math.max(pick,notpick);
    }
}