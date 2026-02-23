class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                 sb.append(Character.toLowerCase(ch));
            }
        }
        String x = sb.toString();
        String y = sb.reverse().toString();
        return y.equals(x);
    }
}