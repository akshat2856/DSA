class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i =0;
      while(i<nums.length-1){
        int y = k;
        if(nums[i]==1){
            while(y!=0 && i<nums.length-1){
                if( nums[++i]==1){
                return false;}
y--;
            }
        }
        i++;
       } 
       return true;
    }
}