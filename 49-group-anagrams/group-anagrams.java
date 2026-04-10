class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // int n = strs.length;
        // boolean[] visited = new boolean[n];
        // List<List<String>> result = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(visited[i])continue;
        //     List<String> group = new ArrayList<>();
        //     group.add(strs[i]);
        //     visited[i] = true;
        //     for(int j=i+1;j<n;j++){
        //         if(!visited[j] && isAnagrams(strs[i],strs[j])){
        //             group.add(strs[j]);
        //             visited[j] = true;
        //         }
        //     }
        //     result.add(group);
        // }
        // return result;
        if(strs==null||strs.length==0)return new ArrayList<>();
        Map<String,List<String>> freqMap = new HashMap<>();
        for(String str:strs){
            String freqString = getfreqString(str);
            if(freqMap.containsKey(freqString))  freqMap.get(freqString).add(str);
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                 freqMap.put(freqString,strList);
            }
        }
        return new ArrayList<>(freqMap.values());
    }
    // boolean isAnagrams(String s,String t){
    //  s = s.toLowerCase();
    //  t = t.toLowerCase();
    //  s = s.replace(" ","");
    //  t = t.replace(" ","");
    //  int[] counts = new int[26];
    //  for(int i=0;i<s.length();i++){
    //     counts[s.charAt(i)-'a']++;
    //  }
    //  for(int i=0;i<t.length();i++){
    //     counts[t.charAt(i)-'a']--;
    //  }
    //  for(int count:counts){
    //     if(count!=0)return false;
    //  }
    //  return true;
    // }
    private String getfreqString(String str){
        int[] freq = new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder freqString = new StringBuilder("");
        char c = 'a';
        for(int i:freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }
        return freqString.toString();
    }
}