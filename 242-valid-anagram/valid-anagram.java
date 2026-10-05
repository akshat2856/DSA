class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        String p = new String(ch1);
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        String q = new String(ch2);
        return p.equals(q);
    }
}