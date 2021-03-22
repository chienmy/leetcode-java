import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_153Test {

    @Test
    public void findMinA() {
        assertEquals(1, new Solution_153().findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void findMinB() {
        assertEquals(0, new Solution_153().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    public void findMinC() {
        assertEquals(1, new Solution_153().findMin(new int[]{1}));
    }
}