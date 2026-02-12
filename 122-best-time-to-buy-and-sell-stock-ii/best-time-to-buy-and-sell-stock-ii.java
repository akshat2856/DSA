class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
    Arrays.fill(dp[i], -1);
}
        return solve(prices,0,1,n,dp);
    }
    public int solve(int[] prices,int ind,int buy,int n,int[][] dp){
        int profit = 0;
        if(ind==n)return 0;
        if(dp[ind][buy]!=-1)return dp[ind][buy];
        if(buy==1){
            profit = Math.max((-prices[ind] + solve(prices,ind+1,0,n,dp)),(0+solve(prices,ind+1,1,n,dp)));
        }
        else{
 profit = Math.max((prices[ind] + solve(prices,ind+1,1,n,dp)),(0+solve(prices,ind+1,0,n,dp)));
        }
        return dp[ind][buy] = profit;
    }

}