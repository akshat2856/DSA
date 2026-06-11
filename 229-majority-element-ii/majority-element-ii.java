class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> answer = new ArrayList<>();
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> it : map.entrySet()){
        //     if(it.getValue()>(n/3))answer.add(it.getKey());
        // }
        int cande1 = -1;
        int cande2 = -1;
        int count1 =0;
        int count2 = 0;
        for(int num: nums){
            if(num==cande1)count1++;
            else if(num==cande2)count2++;
            else if(count1==0){
                cande1 = num;
                count1 = 1;
            }
            else if(count2==0){
                cande2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for(int num:nums){
            if(num==cande1)count1++;
            if(num==cande2)count2++;
        }
        if(count1>(n/3))answer.add(cande1);
        if(count2>(n/3) && cande2!=cande1)answer.add(cande2);
        return answer;
    }
}