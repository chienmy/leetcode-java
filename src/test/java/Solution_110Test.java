import helper.TreeHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_110Test {

    @Test
    public void isBalancedA() {
        assertTrue(new Solution_110().isBalanced(TreeHelper.generateTree(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    public void isBalancedB() {
        assertFalse(new Solution_110().isBalanced(TreeHelper.generateTree(1, 2, 2, 3, 3, null, null, 4, 4)));
    }

    @Test
    public void isBalancedC() {
        assertTrue(new Solution_110().isBalanced(null));
    }
}