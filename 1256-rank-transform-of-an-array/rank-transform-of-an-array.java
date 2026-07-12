class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(i==0) map.put(nums[i],1);
           else{
            if(nums[i]>nums[i-1])map.put(nums[i], map.getOrDefault(nums[i-1], 0) + 1);
           // else map.put(nums[i],map.get(nums[i]));
           }
        }
        int[] newarray = new int[n];
        for(int i=0;i<n;i++){
            newarray[i] = map.get(arr[i]);
        }
        return newarray;
    }
}