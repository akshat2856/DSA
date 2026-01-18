class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    void solve(int[] ip, List<Integer> op) {

       
        if (ip.length == 0) {
            ans.add(new ArrayList<>(op));
            return;
        }

     
        List<Integer> op1 = new ArrayList<>(op);

        
        List<Integer> op2 = new ArrayList<>(op);
        op2.add(ip[0]);

       
        int[] newIp = Arrays.copyOfRange(ip, 1, ip.length);

        solve(newIp, op1);
        solve(newIp, op2);
    }

    public List<List<Integer>> subsets(int[] nums) {
        solve(nums, new ArrayList<>());
        return ans;
    }
}
