class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    // HashSet<Integer> see = new HashSet<>();
    // for(int i=0 ; i<nums.length ; i++){
    //     see.add(nums[i]);
    // }

    // for(int j=0 ; j<=nums.length ; j++){
    //     if(!see.contains(j))return j;
    // }
    // return -1;
    }
}