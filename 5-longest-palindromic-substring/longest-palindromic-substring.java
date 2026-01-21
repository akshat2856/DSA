class Solution {
    public boolean isPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j) {
        if (s.charAt(i) != s.charAt(j)) return false;
        i++;
        j--;
    }
    return true;
}
    public String longestPalindrome(String s) {
     int max = 0;
    String ans = "";

    for (int i = 0; i < s.length(); i++) {
        for (int j = i; j < s.length(); j++) {
            String sub = s.substring(i, j + 1);
            if (isPalindrome(sub) && sub.length() > max) {
                max = sub.length();
                ans = sub;
            }
        }
    }
    return ans;
}
}