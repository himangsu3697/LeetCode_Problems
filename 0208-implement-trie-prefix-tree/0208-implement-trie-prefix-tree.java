class Trie {

    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord;
    }

    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }

            curr = curr.children[index];
        }

        curr.endOfWord = true;
    }

    public boolean search(String word) {
        Node curr = getNode(word);

        return curr != null && curr.endOfWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private Node getNode(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (curr.children[index] == null) {
                return null;
            }

            curr = curr.children[index];
        }

        return curr;
    }
}