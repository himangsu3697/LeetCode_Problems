
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
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode temp = q.remove();
            if (temp == null) {
                flag = true;
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                if (flag) {
                    list.add(temp.val);
                    flag = false;
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
            }
        }
        return list;
    }
}