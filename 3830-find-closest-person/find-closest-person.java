class Solution {
    public int findClosest(int x, int y, int z) {
       int cnt1 =0;
       int cnt2 =0;
       while(x<z){
        x++;
        cnt1++;
       } 
      while(x>z){
        x--;
        cnt1++;
       }
        while(y<z){
        y++;
        cnt2++;
       } 
     while(y>z){
        y--;
        cnt2++;
       }
       if(cnt1<cnt2){
        return 1;
       }
       else if(cnt1>cnt2){
        return 2;
       }
       return 0;
       
    }
}