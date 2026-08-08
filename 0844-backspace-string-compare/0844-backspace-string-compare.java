import java.util.ArrayDeque;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayDeque <Character> st = new ArrayDeque<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == '#') {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(c);
            }
        }
        while(!st.isEmpty()) {
            sb1.insert(0,st.pop());
        }

        for(char c : t.toCharArray()) {
            if(c == '#') {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(c);
            }
        }
        while(!st.isEmpty()) {
            sb2.insert(0,st.pop());
        }
        return sb1.toString().equals(sb2.toString());
    }
}