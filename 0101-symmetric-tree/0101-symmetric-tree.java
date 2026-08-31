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
    public boolean symmetricTree(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return true;
        } 
        if(t1 == null || t2 == null) {
            return false;
        }
        if(t1.val == t2.val) {
            boolean l = symmetricTree(t1.left, t2.right);
            boolean r = symmetricTree(t1.right, t2.left);
            if(l && r) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode left, right;
        if (root.left != null && root.right != null) {
            left = root.left;
            right = root.right;
            return symmetricTree(left, right);
        } else if (root.left == null && root.right == null) {
            return true;
        } else {
            return false;
        }
    }
}