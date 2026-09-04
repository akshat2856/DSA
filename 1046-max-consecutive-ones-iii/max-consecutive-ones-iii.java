class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        int count0 = 0;
        while(j<n){
            if(nums[j]==0){
                count0++;
            }
            while(count0>k){
                if(nums[i]==0)count0--;
                i++;
            }
            count=Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}