class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
       Stack<Integer> val = new Stack<>();
       for(int i=0;i<n;i++){
        if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*") ||tokens[i].equals("/")){
        int val2 = val.pop();
        int val1 = val.pop();
        if(tokens[i].equals("+"))val.push(val1+val2);
        else if(tokens[i].equals("-"))val.push(val1-val2);
        else if(tokens[i].equals("*"))val.push(val1*val2);
        else if(tokens[i].equals("/"))val.push(val1/val2);
        }
        else val.push(Integer.parseInt(tokens[i]));
       } 
       return val.peek();
    }
}