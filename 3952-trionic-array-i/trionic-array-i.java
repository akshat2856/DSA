class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n<4)return false;
        int index = 0;
        while(index+1<n && nums[index]<nums[index+1]){
            index+=1;
        }
        if(index ==0 || index == n-1)return false;
        int peak_index = index;
        while(index+1<n && nums[index]>nums[index+1]){
            index+=1;
        }
        if(index==peak_index || index==n-1)return false;
        while(index+1<n && nums[index]<nums[index+1]){
            index+=1;
        }
        return index==n-1;
    }
}