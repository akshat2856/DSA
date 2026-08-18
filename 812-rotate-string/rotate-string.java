class Solution {
    public boolean rotateString(String s, String goal) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()!=goal.length())return false;
        return ((s+s).contains(goal));
    }
}