class Solution {
    public int minBitFlips(int start, int goal) {
        int x = start^goal;
        int cntt = 0;
        while(x!=0){
          cntt+=(x&1);
         x =  x>>1;
        }
        return cntt;
    }
}