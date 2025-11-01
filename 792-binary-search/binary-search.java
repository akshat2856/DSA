class Solution {
    public int helper(int[] nums, int target,int lo,int hi) {
        if(lo>hi)return -1;
        int mid = lo +(hi-lo)/2;
    if(nums[mid]==target)return mid;
     else if(nums[mid]>target) return helper(nums,target,lo,mid-1);
else return helper(nums,target,mid+1,hi);
        // int left = 0, right = nums.length - 1;
        // while (left <= right) {
        //     int mid = left + (right - left) / 2;

        //     if (nums[mid] == target) {
        //         return mid; 
        //     } else if (nums[mid] < target) {
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
        // }
        // return -1;
    }
    public int search(int[] nums,int target){
        return helper(nums,target,0,nums.length-1);
    }
}
