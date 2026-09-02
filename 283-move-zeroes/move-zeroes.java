class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=1;
        while(j<n){
            if(nums[i]==0 && nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
            if(nums[i]!=0 && nums[j]==0){
                i++;
            }
            if(nums[i]!=0 && nums[j]!=0){
                i++;
            }
            j++;
        }   
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}