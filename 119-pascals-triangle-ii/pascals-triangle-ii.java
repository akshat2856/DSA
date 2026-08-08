class Solution {
    public List<Integer> getRow(int numRows) {
     List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < numRows+1; i++) {
    List<Integer> ans = new ArrayList<>();
    for (int j = 0; j <= i; j++) {
    if (j == 0 || j == i) {
          ans.add(1);
        }
        else{
        int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
        ans.add(val);
         }
        }
        result.add(ans);
        }
        return result.get(numRows);
    }
}