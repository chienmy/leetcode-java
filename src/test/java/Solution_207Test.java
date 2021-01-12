import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_207Test {
    @Test
    public void canFinishA() {
        assertTrue(new Solution_207().canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    public void canFinishB() {
        assertFalse(new Solution_207().canFinish(2, new int[][]{{0, 1}, {1, 0}}));
    }
}