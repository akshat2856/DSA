class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums,answer,list,0);
        return answer;
    }
    public void solve(int[] nums,List<List<Integer>> answer,List<Integer> list,int idx){
        if(idx==nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        solve(nums,answer,list,idx+1);
        list.remove(list.size()-1);
        solve(nums,answer,list,idx+1);
    }
}