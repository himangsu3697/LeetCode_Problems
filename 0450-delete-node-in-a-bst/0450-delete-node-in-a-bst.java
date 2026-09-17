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
    TreeNode pre;
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        } else if(root.val == key) {
            //delete a leaf node
            if(root.left == null && root.right == null) {
                root = null;
                return root;
            } 

            //delete a node with one child
            if(root.left != null && root.right == null) {
                return root.left;
            }  
            
            if(root.right != null && root.left == null){
                return root.right;
            }

            //delete node whith two childrens
            TreeNode pre = root.right;
            while(pre.left != null) {
                pre = pre.left;
            }
            root.val = pre.val;
            root.right = deleteNode(root.right, pre.val);
            return root;
        } 
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}