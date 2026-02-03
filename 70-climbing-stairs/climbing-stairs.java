class Solution {
   
    public int climbStairs(int n ) {
        int[] t = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            t[i] = -1;
        }

        return solve(n, t);
    }
     public int solve(int n, int[] t) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        if (t[n] != -1) return t[n];

        return t[n] = solve(n - 1, t) + solve(n - 2, t);
    }
}