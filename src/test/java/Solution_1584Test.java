import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1584Test {

    @Test
    public void minCostConnectPoints() {
        assertEquals(20, new Solution_1584().minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}));
    }
}