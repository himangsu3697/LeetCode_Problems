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
    static class TreeInfo {
        int ht;
        int dm;

        TreeInfo(int ht, int dm) {
            this.ht = ht;
            this.dm = dm;
        }
    }

    public TreeInfo treeInformation(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        if (root.left == null && root.right == null) {
            return new TreeInfo(1, 1);
        }

        TreeInfo left = treeInformation(root.left);
        TreeInfo right = treeInformation(root.right);
        int ht = (left.ht > right.ht) ? left.ht : right.ht;
        ht+=1;
        int dm = Math.max(Math.max(left.dm, right.dm), left.ht + right.ht + 1);
        return new TreeInfo(ht, dm);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return treeInformation(root).dm - 1;
    }
}