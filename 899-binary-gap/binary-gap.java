class Solution {
    public int binaryGap(int n) {
    int previous = -1; 
    int maxGap = 0;
    int position = 0;
    while (n > 0) {
    if ((n & 1) == 1) {
    if (previous >= 0) {
    maxGap = Math.max(maxGap, position - previous);
    }
    previous = position;
    }
    n >>= 1;
    position++;
    }
    return maxGap;   
    }
}