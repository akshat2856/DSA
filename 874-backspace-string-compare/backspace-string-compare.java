class Solution {
    public boolean backspaceCompare(String s, String t) {
        String p = change(s);
        String q = change(t);
        System.out.println(p);
        System.out.println(q);
        if(p.equals(q))return true;
        else return false;
    }
    public String change(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(st.peek()=='#' && Character.isLetter(ch) ){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){ 
        if(st.peek()=='#')st.pop();
        else sb.append(st.pop()); }
        return sb.toString();
    }
}