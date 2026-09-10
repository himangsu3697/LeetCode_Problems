class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int calculate(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = Math.max(0, calculate(root.left));
        int rightSum = Math.max(0, calculate(root.right));
        int rootSum = leftSum + rightSum + root.val;
        maxSum = Math.max(maxSum, rootSum);
        return root.val + Math.max(leftSum, rightSum);
    }

    public int maxPathSum(TreeNode root) {
        calculate(root);
        return maxSum;
    }
}