import java.util.*;

class Solution {
    List<Integer> result = new ArrayList<>();
    int maxCount = 0;
    int count = 0;
    Integer prev = null;

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev == null || prev != root.val) {
            count = 1;
        } else {
            count++;
        }

        if (count > maxCount) {
            result.clear();
            result.add(root.val);
            maxCount = count;
        } else if (count == maxCount) {
            result.add(root.val);
        }

        prev = root.val;

        inorder(root.right);
    }
}