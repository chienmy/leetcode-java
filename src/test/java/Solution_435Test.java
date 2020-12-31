import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_435Test {

    @Test
    public void eraseOverlapIntervalsA() {
        int[][] data = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, new Solution_435().eraseOverlapIntervals(data));
    }

    @Test
    public void eraseOverlapIntervalsB() {
        int[][] data = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        assertEquals(2, new Solution_435().eraseOverlapIntervals(data));
    }

    @Test
    public void eraseOverlapIntervalsC() {
        int[][] data = new int[][]{{1, 2}, {2, 3}};
        assertEquals(0, new Solution_435().eraseOverlapIntervals(data));
    }

}