class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] answer = new int[n+m];
        int i=0;
        int k=0;
        while(i<(n)){
            answer[i++] = nums1[k++];
        }
        int j =0;
        while(i<(m+n)){
            answer[i++] = nums2[j++];
        }
        Arrays.sort(answer);
        int left = 0;
        int right = m+n-1;
        int mid = left + (right-left)/2;
        if((m+n)%2!=0){
            return (double)answer[mid];
        }
        else{
             return ((double)(answer[mid]+answer[mid+1])/2);
        }
    }
}