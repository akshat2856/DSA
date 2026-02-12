class Solution {
//        public int solve(int[] prices,int ind,int buy,int n,int[][] dp){
//         int profit = 0;
//         if(ind>=n)return 0;
//         if(dp[ind][buy]!=-1)return dp[ind][buy];
//         if(buy==1){
//             profit = Math.max((-prices[ind] + solve(prices,ind+1,0,n,dp)),(0+solve(prices,ind+1,1,n,dp)));
//         }
//         else{
//  profit = Math.max((prices[ind] + solve(prices,ind+2,1,n,dp)),(0+solve(prices,ind+1,0,n,dp)));
//         }
//         return dp[ind][buy] = profit;
//   }
    public int maxProfit(int[] prices) {
           int n = prices.length;
        int[][] dp = new int[n+2][2];
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                if(buy==1) dp[ind][buy] = Math.max(-prices[ind] + dp[ind+1][0],dp[ind+1][1]);
                else dp[ind][buy] = Math.max(prices[ind] + dp[ind+2][1],dp[ind+1][0]);
            }
        }   
        return dp[0][1];
}
}