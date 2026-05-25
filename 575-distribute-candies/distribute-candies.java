class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(candyType[i]);
        }
        if((n/2)<=set.size()) return n/2;
        return set.size();
    }
}