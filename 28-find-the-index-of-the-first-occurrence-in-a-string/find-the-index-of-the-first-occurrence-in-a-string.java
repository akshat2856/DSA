class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())return -1;
        if(haystack.equals(needle))return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,needle.length()+i).equals(needle))return i;
        }
        return -1;
    }
}