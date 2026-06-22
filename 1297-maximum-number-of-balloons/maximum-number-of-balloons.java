class Solution {
    public int maxNumberOfBalloons(String text) {
        int min = Integer.MAX_VALUE;
        int[] okay = new int[26];
        for(char ch : text.toCharArray()){
            okay[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(i==0 || i==1 ||  i==13){
                min = Math.min(min,okay[i]);
            }
            if(i==11 || i==14){
                min = Math.min(min,okay[i]/2);
            }
        }
        return min;
    }
}