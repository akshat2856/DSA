class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else {
                if(st.isEmpty())return false;
                char chok = st.pop();
                if((ch==')'&& chok!='(')||(ch=='}'&& chok!='{')||(ch==']'&& chok!='['))return false;
            }
        }
        return st.isEmpty();
    }
}