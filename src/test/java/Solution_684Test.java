import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_684Test {

    @Test
    public void findRedundantConnectionA() {
        assertEquals(2, new Solution_684().findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}})[0]);
    }

    @Test
    public void findRedundantConnectionB() {
        assertEquals(1, new Solution_684().findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}})[0]);
    }
}