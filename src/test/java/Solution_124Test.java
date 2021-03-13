import helper.TreeHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_124Test {

    @Test
    public void maxPathSumA() {
        assertEquals(6, new Solution_124().maxPathSum(TreeHelper.generateTree(1, 2, 3)));
    }

    @Test
    public void maxPathSumB() {
        assertEquals(42, new Solution_124().maxPathSum(TreeHelper.generateTree(-10, 9, 20, null, null, 15, 7)));
    }
}