class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int miss = 1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }   
        while(set.contains(miss)){
            miss++;
        }
        return miss;
    }
}