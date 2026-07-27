class Solution {
    ArrayList<String> list = new ArrayList<>();
    public void findPaths(TreeNode root, List<String> list, StringBuilder s) {
        if (root == null) {
            return;
        }
        int len = s.length();
        if (len == 0) {
            s.append(root.val);
        } else {
            s.append("->").append(root.val);
        }
        if (root.left == null && root.right == null) {
            list.add(s.toString());
        } else {
            findPaths(root.left, list, s);
            findPaths(root.right, list, s);
        }
        s.setLength(len);   
    }

    public List<String> binaryTreePaths(TreeNode root) {
        findPaths(root, list, new StringBuilder());
        return list;
    }
}