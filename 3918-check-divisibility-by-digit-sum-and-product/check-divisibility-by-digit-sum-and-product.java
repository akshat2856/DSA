class Solution {
    public boolean checkDivisibility(int n) {
        int product = 1;
        int sum = 0;
        int i = n;
        int j = n;
        while(i!=0){
            product*=i%10;
            i=i/10;
        }
        while(j!=0){
            sum+=j%10;
            j=j/10;
        }
        return n%(sum+product)==0;
    }
}