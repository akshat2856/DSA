class Solution {
    public int xorOperation(int n, int start) {
  int s = start >> 1;
    int xor = xorUpto(s - 1) ^ xorUpto(s + n - 1);
    xor <<= 1;
    if ((n & start & 1) == 1) xor |= 1;
    return xor;
}

public int xorUpto(int x) {
    if (x % 4 == 0) return x;
    if (x % 4 == 1) return 1;
    if (x % 4 == 2) return x + 1;
    return 0;
}
}