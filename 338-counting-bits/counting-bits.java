class Solution {
    public int[] countBits(int n) {
        int[] re = new int[n+1];
       for(int i=1;i<=n;i++){
        re[i] = re[i&(i-1)] + 1;
       }
       return re;
    }
}