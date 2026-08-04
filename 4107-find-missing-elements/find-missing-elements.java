class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int strt = nums[0];
        int end = nums[n-1];
        for(int i=strt;i<=end;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}