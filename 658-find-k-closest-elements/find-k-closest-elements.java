class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] == b[0]) return b[1] - a[1]; 
                return b[0] - a[0]; 
            }
        );
        for (int i = 0; i < arr.length; i++) {
            maxHeap.offer(new int[]{
                Math.abs(arr[i] - x), arr[i]
            });
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (maxHeap.size() > 0) {
            result.add(maxHeap.peek()[1]);
            maxHeap.poll();
        }
        Collections.sort(result);
        return result;
    }
}