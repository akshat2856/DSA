class Solution {
    public String frequencySort(String s) {
    int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
       for (char ch : s.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
       }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a,b)->{
                return b[0]-a[0];
            }
        );
        for(char key:map.keySet()){
            maxHeap.add(new int[]{map.get(key),key});
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(!maxHeap.isEmpty()){
           int[] current = maxHeap.poll();
           int frequency = current[0];
           char ch = (char)current[1];
           while(frequency-->0){
            sb.append(ch);
           }
        }
        return sb.toString();
    }
}