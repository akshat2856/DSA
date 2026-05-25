class Solution {
    public int firstUniqChar(String s) {
    int n = s.length();
    for(int i = 0; i < n; i++) {
    boolean flag = false; 
    for(int j = 0; j < n; j++) {
    if(i != j && s.charAt(i) == s.charAt(j)) {
    flag = true;
    break;
     }
    }
    if(flag == false)
    return i;
     }
    return -1;
    }
}