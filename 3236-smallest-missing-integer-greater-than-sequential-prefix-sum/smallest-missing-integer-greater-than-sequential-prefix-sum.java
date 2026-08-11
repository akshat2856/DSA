class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0]+1;
        // int maxsum = 0;
        // for(int i=0;i<n;i++){
        //     maxsum=Math.max(nums[i],maxsum);
        // }
        int sum = nums[0];
        int maxsum = nums[0];
        for(int i=1;i<n;i++){
            if((nums[i]-nums[i-1])!=1)break;
            sum+=nums[i];
            maxsum=Math.max(sum,maxsum);
        }
        Arrays.sort(nums);
        boolean check = false;
        for(int i=0;i<n;i++){
            if(nums[i]==maxsum)check = true;
        }
        if(!check)return maxsum;
        for(int i=1;i<n;i++){
            if(nums[i-1]==maxsum && (nums[i]-nums[i-1])==1)maxsum = nums[i];
        }
        return maxsum+1;
    }
}