class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
      List<List<Integer>> list = new ArrayList<>();
        boolean[] visited =new boolean[nums.length];
        solve(nums,list,new ArrayList<>(),visited);
        List<List<Integer>> uniqueLists = list.stream()
    .distinct()
    .collect(Collectors.toList());
    return uniqueLists;
    }
    public void solve(int[] nums,List<List<Integer>> list,List<Integer> ans,boolean[] visited){
        if(ans.size()==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i])continue;
            visited[i]=true;
            ans.add(nums[i]);
            solve(nums,list,ans,visited);
            ans.remove(ans.size()-1);
            visited[i]=false;
        }
    }
}