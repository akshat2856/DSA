class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k %= total;
        int start = (total - k) % total;
        int row = start / n;
        int col = start % n;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = row; i < m; i++) {
            int j = (i == row) ? col : 0;
            for (; j < n; j++) {
                temp.add(grid[i][j]);
                if (temp.size() == n) {
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                }
            }
        }
        for (int i = 0; i <= row; i++) {
            int end = (i == row) ? col : n;
            for (int j = 0; j < end; j++) {
                temp.add(grid[i][j]);
                if (temp.size() == n) {
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                }
            }
        }
        return res;
    }
}