import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || ! stack.isEmpty()) {
            while (p != null) {
                result.add(p.val);
                stack.push(p);
                p = p.left;
            }
            if (! stack.isEmpty()) {
                p = stack.pop();
                p = p.right;
            }
        }
        return result;
    }
}
