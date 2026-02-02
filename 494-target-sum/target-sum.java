class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n= nums.length;
        int totalsum =0;
        for (int ele : nums) {
            totalsum += ele;
        }
        if (Math.abs(target) > totalsum) return 0;
        if ((target + totalsum) % 2 != 0) return 0;
        int sum = (target + totalsum) / 2;
        int result = subsetsum(nums,sum,n);
         return result;
    }
    public static int subsetsum(int[] nums,int sum,int n){
        int[][] t = new int[n+1][sum+1];
       t[0][0] =1;
        for(int i=1;i<n+1;i++){
            for(int j=0 ; j<sum+1 ; j++){
                if(nums[i-1]<=j)t[i][j] = t[i-1][j-nums[i-1]] + t[i-1][j];
                else t[i][j] =   t[i-1][j];
            }
        }
        return t[n][sum];
    }
}