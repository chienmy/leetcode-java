import helper.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> numList = new LinkedList<>();
        queue.add(root);
        numList.add(root.val);
        while (! queue.isEmpty()) {
            result.add(numList);
            numList = new LinkedList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode p = queue.pop();
                if (p.left != null) {
                    queue.add(p.left);
                    numList.add(p.left.val);
                }
                if (p.right != null) {
                    queue.add(p.right);
                    numList.add(p.right.val);
                }
            }
        }
        return result;
    }
}
