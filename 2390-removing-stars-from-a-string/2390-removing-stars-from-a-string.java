import java.util.Stack;
class Solution {
    public String removeStars(String s) {
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '*') {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder res = new StringBuilder("");
        while(!st.isEmpty()) {
            res.insert(0,st.pop());
        }
        return res.toString();
    }
}