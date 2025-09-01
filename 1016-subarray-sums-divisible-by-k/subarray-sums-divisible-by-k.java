class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     int[] freq = new int[k];
     freq[0] = 1;
     int prefix  = 0;
     int result  = 0;
     for(int num : nums){
        prefix += num;
        int rem = prefix%k;
        if(rem<0){
            rem+=k;
        }
        result += freq[rem];
        freq[rem]++;
     }   
     return result;
    }
}