class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    PriorityQueue<int[]> minHeap = new PriorityQueue<>(
        (a,b)->{
            if(a[0]==b[0])return a[1]-b[1];
            return a[0]-b[0];
        }
    );
    for(int key : map.keySet()){
        minHeap.add(new int[]{map.get(key),key});
        if(minHeap.size()>k)minHeap.poll();
    }
    int[] result = new int[k];
    for(int i=k-1;i>=0;i--){
        result[i] = minHeap.poll()[1];
    }
    return result;
    }
}