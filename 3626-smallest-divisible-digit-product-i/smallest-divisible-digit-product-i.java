class Solution {
    public int smallestNumber(int n, int t) {
        while(product(n)%t!=0){
            n=n+1;
        }
        return n;
    }
    public int product(int n){
        int product = 1;
        while(n!=0){
            int rem = n%10;
            product*=rem;
            n=n/10;
        }
        return product;
    }
}