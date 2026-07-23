class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String p = new String(arr);
            if(!map.containsKey(p)){
                map.put(p,new ArrayList<>());
            }
                map.get(p).add(s);
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}