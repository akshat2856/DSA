class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i =0;
        int j = i+1;
       while(j<n){
        if(nums[i]==0 && nums[j]!=0){
            swap(nums,i,j);
            i++;
            j++;
        }
        else if(nums[i]==0 && nums[j]==0){
            j++;
        }
         else {  
                i++;
                if(i == j) j++;
            }
       }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}