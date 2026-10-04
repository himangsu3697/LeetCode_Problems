class Trie {
    static class Node {
        Node children[];
        boolean endOfWord;

        public Node() {
            this.children = new Node[26];
            this.endOfWord = false;
        }
    }

    Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            if (temp.children[word.charAt(i) - 'a'] == null) {
                temp.children[word.charAt(i) - 'a'] = new Node();
            }
            temp = temp.children[word.charAt(i) - 'a'];
        }
        temp.endOfWord = true;
    }

    public boolean search(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            if (temp.children[word.charAt(i) - 'a'] == null) {
                return false;
            }
            temp = temp.children[word.charAt(i) - 'a'];
        }
        if (temp.endOfWord == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean startsWith(String prefix) {
        Node temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (temp.children[ prefix.charAt(i) - 'a'] == null) {
                return false;
            }
            temp = temp.children[ prefix.charAt(i) - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */