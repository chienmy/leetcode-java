import helper.TreeHelper;
import helper.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_98Test {

    @Test
    public void isValidTestA() {
        TreeNode root = TreeHelper.generateTree(2, 1, 3);
        assertTrue(new Solution_98().isValidBST(root));
    }

    @Test
    public void isValidTestB() {
        TreeNode root = TreeHelper.generateTree(5, 1, 4, null, null, 3, 6);
        assertFalse(new Solution_98().isValidBST(root));
    }
}
