import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                st.pop();
            } 
            else if (op.equals("+")) {
                int n1 = st.pop();
                int n2 = st.peek();
                st.push(n1);
                st.push(n1 + n2);
            } 
            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } 
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        while (!st.isEmpty()) {
            total += st.pop();
        }

        return total;
    }
}