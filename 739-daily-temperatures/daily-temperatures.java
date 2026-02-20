class Solution {
    public int[] dailyTemperatures(int[] arr) {
    int n = arr.length;
    int[] left = new int[n];
    Deque<Integer> st = new ArrayDeque<>();
    for (int i = n-1; i >= 0; i--) {
        while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
            st.pop();
        }
        if (st.isEmpty())
            left[i] = 0;   
        else
            left[i] = st.peek()-i;

        st.push(i);
    }
    // for(int i=0;i<n;i++){
    //     if(left[i]!=0)
    //     left[i] = left[i]-i;
    // }
    return left;
    }
}