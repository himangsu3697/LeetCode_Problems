class Solution {
    public String reverseWords(String s) {
        s = s.trim() + " ";
        String res = "", currWord = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                currWord += s.charAt(i);
            } else {
                if (!currWord.isEmpty()) {
                    if (res.isEmpty()) {
                        res = currWord;
                    } else {
                        res = currWord + " " + res;
                    }
                    currWord = "";
                }
            }
        }

        return res;
    }
}