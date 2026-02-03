class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] t = new int[n];
        for(int i=0;i<n ; i++){
            t[i]=-1;
        }
        return f(n-1,nums,t);
    }
    public int f(int ind,int[] nums,int[] t){
      if(ind==0)return nums[ind];
      if(ind<0)return 0;
      if(t[ind]!=-1)return t[ind];
      int pick = nums[ind] + f(ind-2,nums,t);
      int non_pick = 0 + f(ind-1,nums,t);
      return  t[ind] = Math.max(pick,non_pick);
    }
}