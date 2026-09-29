class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(candidates,target,answer,list,0,0);
        return answer;
    }
    public void solve(int[] c,int target,List<List<Integer>> answer,List<Integer> list,int sum,int idx){
        if(sum == target){
        answer.add(new ArrayList<>(list));
        return;
        }
        if(sum > target || idx == c.length){
        return;
        }
        list.add(c[idx]);
        solve(c,target,answer,list,sum+c[idx],idx);
        list.remove(list.size()-1);
        solve(c,target,answer,list,sum,++idx);
    }
}