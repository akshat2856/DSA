class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a,b)->{
                if(a[0]==b[0])return b[1]-a[1];
                return a[0]-b[0];
            }
        );
        for(int key:map.keySet()){
            minHeap.add(new int[]{map.get(key),key});
        }
        int[] answer = new int[n];
        int i=0;
        while(!minHeap.isEmpty()){
           int[] current = minHeap.poll();
           int frequency = current[0];
           int val = current[1];
           while(frequency-->0){
            answer[i++] = val;
           }
        }
        return answer;
    }
}