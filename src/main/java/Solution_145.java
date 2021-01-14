import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        TreeNode lastVisit = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            //查看当前栈顶元素
            p = stack.peek();
            //如果其右子树也为空，或者右子树已经访问
            //则可以直接输出当前节点的值
            if (p.right == null || p.right == lastVisit) {
                result.add(p.val);
                stack.pop();
                lastVisit = p;
                p = null;
            } else {
                //否则继续遍历右子树
                p = p.right;
            }
        }
        return result;
    }
}
