import helper.TreeHelper;
import helper.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution_145Test {
    @Test
    public void postorderTraversal() {
        TreeNode root = TreeHelper.generateTree(1, null, 2, 3);
        assertEquals("[3, 2, 1]", Arrays.toString(new Solution_145().postorderTraversal(root).toArray()));
    }
}