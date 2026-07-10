import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        char ch = s.charAt(0);
        if(s.length() % 2 != 0 || ch == ')' || ch == '}' || ch == ']') {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if(top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if(st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}