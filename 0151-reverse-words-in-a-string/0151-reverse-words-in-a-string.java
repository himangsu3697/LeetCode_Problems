class Solution {
    public String reverseWords(String s) {
        s = s.trim() + " ";

        StringBuilder word = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else if (word.length() > 0) {
                if (res.length() == 0) {
                    res.append(word);
                } else {
                    res.insert(0, word + " ");
                }
                word.setLength(0);
            }
        }

        return res.toString();
    }
}