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
 import java.util.HashMap;
class Solution {
    public void helper(TreeNode root, HashMap<Integer, Integer> map) {
        if(root != null) {
            helper(root.left, map);
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            helper(root.right, map);
        }
    }

    public int[] findMode(TreeNode root) {
        HashMap <Integer, Integer> map = new HashMap<>();
        helper(root, map);
        int max[] = new int[2];
        int res[] = new int[map.size()];
        int idx = 0;
        for(int key : map.keySet()) {
            if(max[1] < map.get(key)) {
                max[0] = key; 
                max[1] = map.get(key);
            }
        }
        
        for(int key : map.keySet()) {
            if(max[1] == map.get(key)) {
                res[idx++] = key;
            }
        }
        return Arrays.copyOf(res, idx);
    }
}