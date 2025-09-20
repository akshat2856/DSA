class Solution {
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray(); 
        int n = chars.length;
        int idx = 0; 
        for (int i = 0; i < n; i++) {
            if (idx >= 2 && chars[idx - 1] == chars[idx - 2] && chars[idx - 1] == chars[i]) {
                continue; 
            }
            chars[idx++] = chars[i]; 
        }
        return new String(chars, 0, idx);
    }
}


            