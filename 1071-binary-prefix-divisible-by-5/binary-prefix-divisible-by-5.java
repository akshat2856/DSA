class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int number = 0;

        for (int bit : nums) {
            number = (number * 2 + bit) % 5;
            ans.add(number == 0);
        }

        return ans;
    }
}
