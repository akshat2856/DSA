class Solution {
    public int numberOfSpecialChars(String word) {
        int cntt = 0;
        int[] small = new int[26];
        int[] big = new int[26];
        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
            //    if(big[ch-'a'] == -1)big[ch-'a'] = 0;
                if(big[ch-'a'] == 1)small[ch-'a'] = 0;
                else if(big[ch-'a'] != 1 && big[ch-'a'] != -1) small[ch-'a'] = 1;
            }
            else{
                if(small[ch-'A']==1){
                    big[ch-'A'] = 1;
                }
                else big[ch-'A'] = -1;
            }
        }
        for(int i=0;i<26;i++){
            if(small[i]==1 && big[i]==1)cntt++;
        }
        return cntt;
    }
}