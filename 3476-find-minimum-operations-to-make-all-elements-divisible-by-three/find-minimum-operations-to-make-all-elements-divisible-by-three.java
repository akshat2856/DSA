class Solution {
    public int minimumOperations(int[] nums) {
        int cntt=0;
        for(int num : nums){
            int x = num%3;
            if(x!=0){
                cntt+=Math.min(x,3-x);
            }
        }
        return cntt;
    }
}