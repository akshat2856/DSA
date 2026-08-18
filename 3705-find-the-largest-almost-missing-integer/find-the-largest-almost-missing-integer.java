class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        if(k==1){
            Arrays.sort(nums);
            if(nums[n-1]!=nums[n-2])return nums[n-1];
            for(int i=n-2;i>0;i--){
                if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])return nums[i];
            }
            if(nums[0]!=nums[1])return nums[0];
        }
        else if(k==n){
            for(int i=0;i<n;i++){
                max = Math.max(nums[i],max);
            }
            return max;
        }
        else{
            for(int i=0;i<n;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
           if(map.get(nums[0])>1 && map.get(nums[n-1])>1)return -1;
           else if(map.get(nums[0])==1 && map.get(nums[n-1])>1)return nums[0];
           else if(map.get(nums[0])>1 && map.get(nums[n-1])==1)return nums[n-1];
           else return Math.max(nums[0],nums[n-1]);
        }
        return -1;
    }
}