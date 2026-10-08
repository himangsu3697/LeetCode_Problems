class Solution {
    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            res.append(ch);
        }
        return res.toString();
    }
}