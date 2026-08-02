import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String removeStars(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}