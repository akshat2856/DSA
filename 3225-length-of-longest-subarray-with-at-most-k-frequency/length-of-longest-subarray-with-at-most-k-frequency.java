class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j=0;
        int maxcount = 0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                i++;
            }
             maxcount=Math.max(maxcount,j-i+1);
            j++;
        }
        return maxcount;
    }
}