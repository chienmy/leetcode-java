import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val);
                p = node.right;
            }
        }
        return result;
    }
}
