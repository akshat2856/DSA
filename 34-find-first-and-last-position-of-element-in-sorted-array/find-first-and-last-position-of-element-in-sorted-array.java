class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums,target);
        if(first==-1)return new int[]{-1,-1};
        int second = findsecond(nums,target);
        return new int[]{first,second};
    }
    public int findfirst(int[] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans =-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]>target)high = mid-1;
            else low = mid+1;
        }
        return ans;
    }
    public int findsecond(int[] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans =-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]>target)high = mid-1;
            else low = mid+1;
        }
        return ans;
    }
}