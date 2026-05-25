class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        return Math.min(n/2,set.size());
    }
}