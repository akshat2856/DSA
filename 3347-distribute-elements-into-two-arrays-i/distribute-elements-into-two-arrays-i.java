class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<n;i++){
                if(list1.get(list1.size()-1)>list2.get(list2.size()-1))list1.add(nums[i]);
                else list2.add(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            if(list2.size()!=0){
                nums[i]=list2.remove(list2.size()-1);
            }
            else nums[i]=list1.remove(list1.size()-1);
        }
        return nums;
    }
}