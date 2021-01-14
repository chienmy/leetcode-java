import helper.TreeHelper;
import helper.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class Solution_144Test {
    @Test
    public void preorderTestA() {
        TreeNode root = TreeHelper.generateTree(1, null, 2 , 3);
        assertEquals("[1, 2, 3]", Arrays.toString(new Solution_144().preorderTraversal(root).toArray()));
    }

    @Test
    public void preorderTestB() {
        TreeNode root = TreeHelper.generateTree(1, null, 2);
        assertEquals("[1, 2]", Arrays.toString(new Solution_144().preorderTraversal(root).toArray()));
    }

    @Test
    public void preorderTestC() {
        TreeNode root = TreeHelper.generateTree(null);
        assertEquals("[]", Arrays.toString(new Solution_144().preorderTraversal(root).toArray()));
    }
}