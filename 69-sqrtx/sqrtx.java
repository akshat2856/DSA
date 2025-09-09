class Solution {
    public int mySqrt(int x) {
       double y =0.5*Math.log(x); 
      double antilog = Math.exp(y); 
     int ans = (int) antilog;
       if ((long)(ans + 1) * (ans + 1) <= x) {
            return ans + 1;
        }
        return ans;
    }
}