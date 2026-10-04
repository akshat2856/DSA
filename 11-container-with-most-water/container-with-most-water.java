class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int count = 0;
        while(i<=j){
            count=Math.max(count,Math.min(height[i],height[j])*(j-i));
            if(height[j]>height[i])i++;
            else j--;
        }
        return count;
    }
}