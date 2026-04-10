class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // return nums[n-k];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num:nums){
            minHeap.add(num);
            if(minHeap.size()>k)minHeap.poll();
        }
        return minHeap.peek();
    }
}