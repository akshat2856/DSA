class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
         reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
        public void reverse(int[] arr,int start,int end){
            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        public void swap(int[] arrey,int i,int j){
            int temp = arrey[i];
            arrey[i] = arrey[j];
            arrey[j] = temp;
        }
    }
