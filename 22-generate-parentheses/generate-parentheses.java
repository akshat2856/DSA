class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        int close = n;
        int open = n;
        String op = "";
        Solve(open,close,op,li);
        return li;
    }
    public static void Solve(int open,int close,String op,List<String> li){
        if(open==0&&close==0){
            li.add(op);
            return;
        }
        if(open!=0){
            String op1 = op;
            op1 = op1+"(";
            Solve(open-1,close,op1,li);
        }
        if(close>open){
          String  op2 = op;
         op2 = op2+")";
          Solve(open,close-1,op2,li);
        }
        return;
    }
}