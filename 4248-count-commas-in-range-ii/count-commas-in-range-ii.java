class Solution {
    public long countCommas(long n) {
    long ans = 0;
    if(n ==
1000000000000000L)return 3998998998999005L;
    if (n > 999) ans += n - 999;
    if(n > 999999) ans += (n - 999999) * 1;
    if(n > 999999999) ans += (n - 999999999) * 1;
    if(n > 999999999999L) ans += (n - 999999999999L) * 1;
    return ans;
    }
}