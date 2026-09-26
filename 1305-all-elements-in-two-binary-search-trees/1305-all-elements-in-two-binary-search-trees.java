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
class Solution {
    public void helper(TreeNode root, List<Integer> list) {
        if(root != null) {
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        helper(root1, list1);
        helper(root2, list2);
        if(root1 == null) {
            return list2;
        }
        if(root2 == null) {
            return list1;
        }
        int i = 0, j = 0;
        while(i < list1.size() && j < list2.size()) {
            if(list1.get(i) < list2.get(j)) {
                i++;
            } else {
                list1.add(i, list2.get(j));
                j++;
                i++;
            }
        }
        while(j < list2.size()) {
            list1.add(list2.get(j++));
        }
        
        return list1;
    }
}