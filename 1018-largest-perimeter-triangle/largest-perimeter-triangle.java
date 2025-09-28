class Solution {
    public int largestPerimeter(int[] nums) {
      Arrays.sort(nums);
      int n =nums.length;
     
      for(int i=n-1;i>=2 ; i--){
        int j =i-1;
        int k =i-2;
        if(j>=0 && k>=0 && (nums[k]+nums[j]>nums[i])){
return nums[k]+nums[j]+nums[i];
        }
      }
return 0;
    }
}