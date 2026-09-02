class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        if(n==0)return true;
        if(m==1 && flowerbed[0]==0)return true;
        if(m>1){
            if(flowerbed[0]==0 && flowerbed[1]==0){
                flowerbed[0] = 1;
                n--;
            }
        }
            for(int i=2;i<m;i++){
                if(i==m-1 && flowerbed[m-1]==0 && flowerbed[m-2]==0){
                    flowerbed[m-1] = 1;
                n--;
                }
                else{
                    if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
            }
        if(n>0)return false;
        return true;
    }
}