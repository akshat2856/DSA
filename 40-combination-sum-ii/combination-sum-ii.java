class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);

        solve(candidates, target, answer, list, 0, 0);

        return answer;
    }

    public void solve(int[] c, int target,
                      List<List<Integer>> answer,
                      List<Integer> list,
                      int sum, int idx) {

        if (sum == target) {
            answer.add(new ArrayList<>(list));
            return;
        }

        if (sum > target || idx == c.length) {
            return;
        }

        // TAKE
        list.add(c[idx]);

        // Move to next index because
        // every element can be used only once
        solve(c, target, answer, list,
              sum + c[idx], idx + 1);

        // BACKTRACK
        list.remove(list.size() - 1);

        // NOT TAKE
        int next = idx + 1;

        // Skip duplicate values
        while (next < c.length && c[next] == c[idx]) {
            next++;
        }

        solve(c, target, answer, list,
              sum, next);
    }
}