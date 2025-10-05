class Solution {
    public int majorityElement(int[] nums) {
        int freq=1;
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                freq++;
            }
            else
            {
                freq--;
            }
            if(freq==0)
            {
                max=nums[i];
                freq=1;
            }
        }
        return max;
    }
}