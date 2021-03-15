import helper.TreeHelper;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_104Test {

    @Test
    public void maxDepthTest() {
        assertEquals(3, new Solution_104().maxDepth(TreeHelper.generateTree(3, 9, 20, null, null, 15, 7)));
    }

}