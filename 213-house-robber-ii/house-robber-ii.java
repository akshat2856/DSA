class Solution {
    public int rob(int[] nums) {
          int n = nums.length;
          int[] x = new int[n-1];
          int[] y = new int[n-1];
          for(int i=0;i<n-1;i++){
            x[i] = nums[i+1];
          }
          for(int i=0;i<n-1;i++){
            y[i] = nums[i];
          }
          if(n==1)return nums[0];
          return Math.max(solve(x),solve(y));
    }
    public int solve(int[] nums){
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int take = nums[i];
            if(i>1)take+=prev2;
            int nontake = 0 + prev;
            int curi = Math.max(take,nontake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
}