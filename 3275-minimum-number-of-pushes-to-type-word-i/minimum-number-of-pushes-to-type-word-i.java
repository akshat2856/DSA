class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count = 0;
        for(int i=0;i<n;i++){
            if(i<8)count++;
            if(i>=8 && i<16)count+=2;
            if(i>=16 && i<24)count+=3;
            if(i>=24 && i<26)count+=4;
        }
        return count;
    }
}