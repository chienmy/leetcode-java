import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_547Test {

    @Test
    public void findCircleNumA() {
        int[][] isConnected = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        assertEquals(2, new Solution_547().findCircleNum(isConnected));
    }

    @Test
    public void findCircleNumB() {
        int[][] isConnected = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(3, new Solution_547().findCircleNum(isConnected));
    }
}