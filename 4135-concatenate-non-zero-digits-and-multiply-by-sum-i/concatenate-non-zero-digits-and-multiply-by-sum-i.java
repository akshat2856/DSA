class Solution {
    public long sumAndMultiply(int n) {
        long temp=0;
        while(n>0){
            int r = n%10;
            if(r!=0)
            temp=temp*10+r;
            n=n/10;
        }
        long rev=0;
        long sum=0;
        while(temp>0){
            long r=temp%10;
            rev=rev*10+r;
            sum+=r;
            temp=temp/10;
        }
        long ans= sum*rev;
        return ans;
    }
}