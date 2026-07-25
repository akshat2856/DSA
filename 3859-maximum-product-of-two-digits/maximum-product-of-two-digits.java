class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int k = ch.length;
        int i = Character.getNumericValue(ch[k-1]);
        int j = Character.getNumericValue(ch[k-2]);
        int answer = i*j;
        return answer;
    }
}