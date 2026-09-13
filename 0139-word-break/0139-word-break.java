class Solution {

    static class Node {
        Node[] children;
        boolean endOfWord;

        Node() {
            children = new Node[26];
            endOfWord = false;
        }
    }

    Node root = new Node();

    public void insert(String word) {
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (temp.children[idx] == null) {
                temp.children[idx] = new Node();
            }

            temp = temp.children[idx];
        }

        temp.endOfWord = true;
    }

    public boolean search(String word) {
        Node temp = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (temp.children[idx] == null) {
                return false;
            }

            temp = temp.children[idx];
        }

        return temp.endOfWord;
    }

    Boolean[] dp;

    public boolean helper(String s) {

        if (s.length() == 0) {
            return true;
        }

        if (dp[s.length()] != null) {
            return dp[s.length()];
        }

        for (int i = 1; i <= s.length(); i++) {

            if (search(s.substring(0, i)) &&
                helper(s.substring(i))) {

                return dp[s.length()] = true;
            }
        }

        return dp[s.length()] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        for (String word : wordDict) {
            insert(word);
        }

        dp = new Boolean[s.length() + 1];

        return helper(s);
    }
}