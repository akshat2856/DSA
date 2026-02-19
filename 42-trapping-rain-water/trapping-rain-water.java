class Solution {
    public int trap(int[] height) {
        int n = height.length;
       int[] maxL = new int[n];
       int[] maxR = new int[n];
       int unit =0;
       int max = height[0];
       for(int i=0;i<n;i++){
        if(height[i]>=max){
            maxL[i] = height[i];
            max = height[i];
        }
        else{
            maxL[i] = max;
        }
       }
       int maxi = height[n-1];
       for(int i=n-1;i>=0;i--){
        if(height[i]>=maxi){
            maxR[i] = height[i];
            maxi = height[i];
        }
        else{
            maxR[i] = maxi;
        }
       }
       for(int i=0;i<n;i++){
        unit+=Math.min(maxL[i],maxR[i])-height[i];
       }
       return unit;
    }
}