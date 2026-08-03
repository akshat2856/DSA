class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int prof = 0;
        for(int i=1;i<n;i++){
            int cost = prices[i]-mini;
            prof = Math.max(cost,prof);
            mini = Math.min(prices[i],mini);
        }
        return prof;
    }
}