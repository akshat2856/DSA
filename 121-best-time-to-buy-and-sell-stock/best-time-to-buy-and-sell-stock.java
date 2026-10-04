class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit = 0;
       int best = prices[0];
       for(int i=1;i<prices.length;i++){
        maxprofit = Math.max(prices[i]-best,maxprofit);
        best = Math.min(best,prices[i]);
       } 
       return maxprofit;
    }
}