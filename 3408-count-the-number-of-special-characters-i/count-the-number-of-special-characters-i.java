class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int cntt = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(Character.isLowerCase(e.getKey())){
               if(map.containsKey((char)(e.getKey()-32)))cntt++;
            }
        }
        return cntt;
    }
}