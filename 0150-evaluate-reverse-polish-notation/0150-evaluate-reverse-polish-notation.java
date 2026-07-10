import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> s  = new Stack<>();
        int n1,n2;
        for(int i=0; i<tokens.length; i++) {
            switch(tokens[i]) {
                    case "+":
                    n1 = s.pop();
                    n2 = s.pop();
                    s.push(n2+n1);
                    break;

                    case "-":
                    n1 = s.pop();
                    n2 = s.pop();
                    s.push(n2-n1);
                    break;

                    case "*":
                    n1 = s.pop();
                    n2 = s.pop();
                    s.push(n2*n1);
                    break;

                    case "/":
                    n1 = s.pop();
                    n2 = s.pop();
                    s.push(n2/n1);
                    break;

                    default :
                    s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}