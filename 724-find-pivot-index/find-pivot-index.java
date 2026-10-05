class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int suml = 0;
        int sumr = 0;
        for(int i=1;i<n;i++){
            suml+=nums[i-1];
            left[i] = suml;
        }
        for(int i=n-2;i>=0;i--){
            sumr+=nums[i+1];
            right[i] = sumr;
        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i])return i;
        }
        return -1;
    }
}