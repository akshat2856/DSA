class Solution {
    class Pair {
        int len;
        int count;
        Pair(int len, int count) {
            this.len = len;
            this.count = count;
        }
    }
    Pair[][] dp;
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        dp = new Pair[n][n + 1];
        Pair ans = solve(nums, 0, -1);
        return ans.count;
    }
    public Pair solve(int[] nums, int idx, int prev) {
        if (idx == nums.length) {
            return new Pair(0, 1);
        }
        if (dp[idx][prev + 1] != null) {
            return dp[idx][prev + 1];
        }
        Pair notPick = solve(nums, idx + 1, prev);
        Pair pick = new Pair(0, 0);
        if (prev == -1 || nums[idx] > nums[prev]) {
            Pair next = solve(nums, idx + 1, idx);
            pick.len = 1 + next.len;
            pick.count = next.count;
        }
        Pair result;
        if (pick.len > notPick.len) {
            result = pick;
        }
        else if (pick.len < notPick.len) {
            result = notPick;
        }
        else {
            result = new Pair(
                pick.len,
                pick.count + notPick.count
            );
        }
        return dp[idx][prev + 1] = result;
    }
}