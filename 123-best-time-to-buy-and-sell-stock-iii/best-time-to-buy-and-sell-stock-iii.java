class Solution {
    public int maxProfit(int[] prices) {
  int n = prices.length;
        int[][][] dp = new int[n][2][3];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(prices,0,1,n,dp,2);
    }
    public int solve(int[] prices,int ind,int buy,int n,int[][][] dp,int cap){
        int profit = 0;
          if(ind == prices.length) return 0;
        if(cap == 0) return 0;
        
        if(dp[ind][buy][cap] != -1)
            return dp[ind][buy][cap];
        if(buy==1){
            profit = Math.max((-prices[ind] + solve(prices,ind+1,0,n,dp,cap)),(0+solve(prices,ind+1,1,n,dp,cap)));
        }
        else{
 profit = Math.max((prices[ind] + solve(prices,ind+1,1,n,dp,cap-1)),(0+solve(prices,ind+1,0,n,dp,cap)));
        }
         return dp[ind][buy][cap] = profit;
    }
}