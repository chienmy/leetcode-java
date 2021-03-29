import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_135Test {

    @Test
    public void candyA() {
        assertEquals(5, new Solution_135().candy(new int[]{1, 2, 3, 1, 0}));
    }

    @Test
    public void candyB() {
        assertEquals(4, new Solution_135().candy(new int[]{1, 2, 2}));
    }
}