class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums,n);
        Arrays.sort(copy);
        int j = n-1;
        for(int i=1;i<n;i+=2){
            nums[i] = copy[j];
            j--;
        }
        int k = 0;
        if(n%2==0){
        for(int i=n-2;i>=0;i-=2){
            nums[i] = copy[k];
            k++;
        }
        }
        else{
           for(int i=n-1;i>=0;i-=2){
            nums[i] = copy[k];
            k++;
        } 
        }
    }
}