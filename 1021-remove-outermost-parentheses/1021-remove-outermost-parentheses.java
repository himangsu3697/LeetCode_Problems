class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (balance > 0) {
                    sb.append('(');
                }
                balance++;
            } else {
                balance--;
                if (balance > 0) {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}