class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        sb = new StringBuilder(new String(chars));
        StringBuilder pq = new StringBuilder(t);
        char[] charss = pq.toString().toCharArray();
        Arrays.sort(charss);
        pq = new StringBuilder(new String(charss));
        return sb.toString().equals(pq.toString());
    }
}