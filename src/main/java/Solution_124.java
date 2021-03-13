import helper.TreeNode;

public class Solution_124 {
    public int maxPathSum(TreeNode root) {
        return maxSum(root)[1];
    }

    private int[] maxSum(TreeNode p) {
        if (p == null) {
            return new int[]{0, Integer.MAX_VALUE};
        }
        int[] left = maxSum(p.left);
        int[] right = maxSum(p.right);
        int singleSum = Math.max(left[0], right[0]) + p.val;
        int bothSum = Math.max(left[1], right[1]);
        bothSum = Math.max(bothSum, left[0] + right[0] + p.val);
        return new int[]{singleSum, bothSum};
    }
}
