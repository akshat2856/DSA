class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        solve(nums,answer,new ArrayList<>(),vis);
        return answer;
    }
    public void solve(int[] nums,List<List<Integer>> answer,List<Integer> list,boolean[] vis){
        if(list.size()==nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i])continue;
            vis[i] = true;
            list.add(nums[i]);
            solve(nums,answer,list,vis);
            list.remove(list.size()-1);
            vis[i] = false;
        }
    }
}