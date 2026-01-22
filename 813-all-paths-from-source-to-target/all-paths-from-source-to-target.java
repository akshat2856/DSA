class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, graph.length - 1, path);
        return result;
    }

    public void dfs(int[][] graph, int node, int target, List<Integer> path) {

        if (node == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int next : graph[node]) {
            path.add(next);
            dfs(graph, next, target, path);
            path.remove(path.size() - 1); 
        }
    }
}
