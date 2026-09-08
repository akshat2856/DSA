class Solution {
    public int countCommas(int n) {
        if(n<999)return 0;
        int ans = 0;
        if(n>999){
            ans = n-1000+1;
        }
        return ans;
    }
}