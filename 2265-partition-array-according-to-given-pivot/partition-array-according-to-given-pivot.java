class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> les = new ArrayList<>();
        ArrayList<Integer> bigger = new ArrayList<>();
        ArrayList<Integer> pi = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot)les.add(nums[i]);
            else if(nums[i]>pivot)bigger.add(nums[i]);
            else pi.add(nums[i]);
        }
        int j =0;
        for(int i=0;i<les.size();i++){
            nums[j++] = les.get(i);
        }
        for(int i=0;i<pi.size();i++){
            nums[j++] = pi.get(i);
        }
        for(int i=0;i<bigger.size();i++){
            nums[j++] = bigger.get(i);
        }
        return nums;
    }
}