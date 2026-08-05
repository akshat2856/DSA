class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] arr : invocations) {
            adj.get(arr[0]).add(arr[1]);
        }
        boolean[] vis = new boolean[n];
        dfs(k, adj, vis);
        boolean canRemove = true;
        for (int[] arr : invocations) {
            int u = arr[0];
            int v = arr[1];

            if (!vis[u] && vis[v]) {
                canRemove = false;
                break;
            }
        }
        if (!canRemove) {
            for (int i = 0; i < n; i++) {
                ans.add(i);
            }
            return ans;
        }
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
    public void dfs(int node, List<List<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        for (int next : adj.get(node)) {
            if (!vis[next]) {
                dfs(next, adj, vis);
            }
        }
    }
}