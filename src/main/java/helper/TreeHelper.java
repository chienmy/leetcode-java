package helper;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHelper {
    public static TreeNode generateTree(Integer... data) {
        if (data.length == 0) return null;
        TreeNode root = new TreeNode(data[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int p = 1;
        while (! queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (p >= data.length) break;
            node.left = data[p] == null ? null : new TreeNode(data[p]);
            p++;
            if (p >= data.length) break;
            node.right = data[p] == null ? null : new TreeNode(data[p]);
            p++;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return root;
    }
}
