class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i=0;
        int j=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.get(s.charAt(j))>1){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
            i++;
            }
            count=Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}