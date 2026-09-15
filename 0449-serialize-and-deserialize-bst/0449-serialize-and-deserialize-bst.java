public class Codec {

    String str = "";

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }

        // Preorder: Root -> Left -> Right
        str += root.val + ",";

        helper(root.left);
        helper(root.right);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        str = "";
        helper(root);
        return str;
    }

    public TreeNode insert(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if (data.length() == 0) {
            return null;
        }

        TreeNode root = null;

        String[] arr = data.split(",");

        for (String s : arr) {
            int val = Integer.parseInt(s);
            root = insert(root, val);
        }

        return root;
    }
}