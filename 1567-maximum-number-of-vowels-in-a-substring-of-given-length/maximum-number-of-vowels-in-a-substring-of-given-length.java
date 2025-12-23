class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int cntt = 0;
        int mx = 0;
        while(j < s.length()){
            if (isVowel(s.charAt(j))) {
            cntt++;
        }
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                mx = Math.max(mx,cntt);
                if (isVowel(s.charAt(i))) {
                cntt--;
            }
                i++;
                j++;
            }
        }
        return mx;
    }
    private boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}
}