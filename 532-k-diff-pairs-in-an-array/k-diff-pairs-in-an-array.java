class Solution {
    public int findPairs(int[] nums, int k) {
     HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> result = new HashSet<>();
    for (int num : nums) {
        if (seen.contains(num - k)) {
            result.add(num - k);
        }
        if (seen.contains(num + k)) {
            result.add(num);
        }
        seen.add(num);
    }
    return result.size();
}
}