import helper.TreeHelper;
import helper.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_257Test {

    @Test
    public void binaryTreePaths() {
        TreeNode root = TreeHelper.generateTree(1, 2, 3, null, 5);
        assertArrayEquals(new String[]{"1->2->5","1->3"}, new Solution_257().binaryTreePaths(root).toArray());
    }
}