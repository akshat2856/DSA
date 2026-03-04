class Solution {
    public int subarraySum(int[] nums, int k) {
        // int i = 0;
        // int j = 0;
        // int cntt = 0;
        // int sum = 0;
        // while(j<nums.length){
        //   sum = sum + nums[j];
        //   if(sum<k){
        //     j++;
        //   }
        //   else if(sum==k){
        //     cntt++;
        //     j++;
        //   }
        //   else if(sum>k){
        //     while(sum>k){
        //         sum = sum - nums[i];
        //         i++;
        //     }
        //     if(sum==k){
        //        cntt++;
        //     }
        //     j++;
        //   }
        // }
        // return cntt;
        HashMap<Integer,Integer> map = new HashMap<>();
        int currentsum =0;
        int totalcount =0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            currentsum+=nums[i];
             if(map.containsKey(currentsum-k)){
                totalcount+=map.get(currentsum-k);
             }
             map.put(currentsum, map.getOrDefault(currentsum,0) + 1);
        }
        return totalcount;
    }
}