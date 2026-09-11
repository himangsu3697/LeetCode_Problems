/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addNode(TreeNode root, int n) {
        if(root == null) {
            TreeNode newNode = new TreeNode(n);
            root = newNode;
            return root;
        } else if(root.val > n) {
            root.left = addNode(root.left, n);
        } else {
            root.right = addNode(root.right, n);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int n : preorder) {
            root = addNode(root, n);
        }
        return root;
    }
}