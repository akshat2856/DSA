class Solution {
    public int minMoves(int[] nums) {
       int min = Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        min=Math.min(nums[i],min);
       }
       for(int i=0;i<nums.length;i++){
       
       nums[i]=nums[i]-min;
       } 
       if(nums.length==1)return 0;
       int sum = 0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       }
       if(sum<0)return -1*sum;
       return sum;
    }
}