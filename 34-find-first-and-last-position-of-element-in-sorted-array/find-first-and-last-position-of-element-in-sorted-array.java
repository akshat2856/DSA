class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int posL =-1;
        int posR = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                posL = mid;
                posR = mid;
                break;
            }
            else if(nums[mid]>target)high = mid-1;
            else low = mid+1;
        }
        if (posL == -1) return new int[]{-1, -1};
        while (posR + 1 < n && nums[posR + 1] == target) {
            posR++;
        }
        while (posL - 1 >= 0 && nums[posL - 1] == target) {
            posL--;
        }
        return new int[]{posL, posR};
    }
}