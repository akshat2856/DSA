class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=n-1;
        int m = 0;
        int o = n-1;
        int[] parity = new int[n];
        while(i<n){
            if(nums[i]%2==0){
                parity[m]=nums[i];
                m++;
            }
            else{
                parity[o]=nums[i];
                o--;
            }
            i++;
        }
        return parity;
    }
}