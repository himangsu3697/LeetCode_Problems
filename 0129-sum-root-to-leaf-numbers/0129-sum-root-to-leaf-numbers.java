class Solution {

    public int helper(TreeNode root, int num) {
        if (root == null) {
            return 0;
        }
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            return num;
        }
        
        int left  = helper(root.left, num);
        int right = helper(root.right, num);

        return left + right;
    }

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
}