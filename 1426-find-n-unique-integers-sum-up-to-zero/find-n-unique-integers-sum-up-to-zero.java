class Solution {
    public int[] sumZero(int n) {
       int[] nums = new int[n];
       int idx=0;
       for(int i=0;i<n/2;i++){
        nums[idx++]=i+1;
        nums[idx++]=-(i+1);
       }
       if(n%2==0) return nums;
        nums[idx]=0;
        return nums;
    
    }   
}