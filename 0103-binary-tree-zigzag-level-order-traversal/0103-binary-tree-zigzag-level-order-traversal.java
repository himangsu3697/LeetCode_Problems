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
 import java.util.LinkedList;
 import java.util.Queue;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        boolean flag = true;
        List <List <Integer>> list = new ArrayList<>();
        ArrayList <Integer> l = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            if(temp == null) {
                flag = !flag;
                list.add(l);
                l = new ArrayList<>();
                if(!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                if(flag) {
                    l.add(temp.val);
                } else { 
                    l.add(0, temp.val);
                }
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return list;
    }
}