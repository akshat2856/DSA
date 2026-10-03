class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        Arrays.sort(strs,(a,b)->(a.length()-b.length()));
        for(int i=0;i<strs[0].length();i++){
            char ss = strs[0].charAt(i);
            boolean check = true;
            for(String arr : strs){
                if(arr.charAt(i)!=ss)check = false;
            }
            if(check==false)break;
            s+=ss;
        }
        return s;
    }
}