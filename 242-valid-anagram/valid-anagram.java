class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String ss = new String(arr);
        char[] arrr = t.toCharArray();
        Arrays.sort(arrr);
        String sss = new String(arrr);
        return ss.equals(sss);
    }
}