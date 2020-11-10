import helper.TreeHelper;
import helper.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution_94Test {
    @Test
    public void inorderTraversal() {
        TreeNode root = TreeHelper.generateTree(1, null, 2, 3);
        assertEquals(Arrays.asList(1, 3, 2), new Solution_94().inorderTraversal(root));
    }
}