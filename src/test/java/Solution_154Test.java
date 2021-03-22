import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_154Test {

    @Test
    public void findMinA() {
        assertEquals(1, new Solution_154().findMin(new int[]{1, 3, 5}));
    }

    @Test
    public void findMinB() {
        assertEquals(0, new Solution_154().findMin(new int[]{2, 2, 2, 0, 1}));
    }
}