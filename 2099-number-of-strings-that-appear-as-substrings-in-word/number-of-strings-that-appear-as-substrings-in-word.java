class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            String s = patterns[i];
            if(isprsent(s,word))count++;
        }
        return count;
    }
    boolean isprsent(String s,String word){
        if(s.length()>word.length())return false;
        for(int i=0;i<=word.length()-s.length();i++){
           if(s.equals(word.substring(i,i+s.length())))return true;
        }
        return false;
    }
}