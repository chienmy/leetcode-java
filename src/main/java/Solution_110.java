import helper.TreeNode;

public class Solution_110 {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) >= 0;
    }

    private int maxDepth(TreeNode p) {
        if (p == null) {
            return 0;
        }
        int left = maxDepth(p.left);
        int right = maxDepth(p.right);
        if (left < 0 || right < 0 || Math.abs(left - right) > 1) {
            return -1;
        } else {
            return Math.max(left, right) + 1;
        }
    }
}
