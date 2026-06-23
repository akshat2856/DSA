class Solution {
    public List<String> letterCasePermutation(String s) {
        String op = "";
        List<String> list = new ArrayList<>();
        solve(s,op,list);
        return list; 
    }
    void solve(String ip,String op,List<String> list){
        if(ip.length()==0){
            list.add(op);
            return;
        }
        char ch = ip.charAt(0);
        ip = ip.substring(1);
        if (Character.isLetter(ch)) {
            solve(ip, op + Character.toLowerCase(ch), list);
            solve(ip, op + Character.toUpperCase(ch), list);
        } else {
            solve(ip, op + ch, list);
        }
    }
}