class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        String t = s.toLowerCase();
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if(freq[t.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
}