class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> pq = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())left[i] = -1;
            else left[i] = st.peek();
            st.push(i);
        }
         for(int i=n-1;i>=0;i--){
            while(!pq.isEmpty() && heights[pq.peek()]>=heights[i]){
                pq.pop();
            }
            if(pq.isEmpty())right[i] = n;
            else right[i] = pq.peek();
            pq.push(i);
        }
         for(int i=0;i<n;i++){
            max = Math.max(max,((right[i]-left[i]-1)*heights[i]));
         }
         return max;
    }
}