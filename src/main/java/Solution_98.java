import helper.TreeNode;

public class Solution_98 {
    public boolean isValidBST(TreeNode root) {
        return divideAndConquer(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean divideAndConquer(TreeNode p, long min, long max) {
        if (p == null) return true;
        if (p.val <= min || max <= p.val) {
            return false;
        }
        boolean left = divideAndConquer(p.left, min, p.val);
        boolean right = divideAndConquer(p.right, p.val, max);
        return left && right;
    }
}
