import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
class Solution {
    public String reverseParentheses(String s) {
        Stack <Character> st = new Stack<>();
        Queue <Character> q = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ')') {
                while(st.peek() != '(') {
                    q.add(st.pop());
                }
                st.pop();
                while(!q.isEmpty()) {
                    st.push(q.remove());
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}