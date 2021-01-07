import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_42Test {
    @Test
    public void trapA() {
        assertEquals(6, new Solution_42().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void trapB() {
        assertEquals(2, new Solution_42().trap(new int[]{2,0,2}));
    }
}