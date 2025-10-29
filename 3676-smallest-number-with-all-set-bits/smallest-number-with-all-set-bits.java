class Solution {
    public int smallestNumber(int n) {
    int x = 1;
int y = (int)Math.pow(2,x);
     while (y <= n) {  
            x++;
            y = (int)Math.pow(2, x);  
        }
    return y-1;
  
    }
}