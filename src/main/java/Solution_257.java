import helper.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder path = new StringBuilder();
        List<String> paths = new LinkedList<>();
        dfs(root, path, paths);
        return paths;
    }

    public void dfs(TreeNode p, StringBuilder path, List<String> paths) {
        if (p == null) {
            return;
        }
        path.append(p.val);
        if (p.left == null && p.right == null) {
            paths.add(path.toString());
        } else {
            path.append("->");
            dfs(p.left, new StringBuilder(path), paths);
            dfs(p.right, new StringBuilder(path), paths);
        }
    }
}
