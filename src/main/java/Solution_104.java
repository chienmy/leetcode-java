import helper.TreeNode;

public class Solution_104 {
    public int maxDepth(TreeNode root) {
        // 返回条件处理
        if (root == null) {
            return 0;
        }
        // divide：分左右子树分别计算
        // conquer：合并左右子树结果，即取二者中的最大值加一
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
