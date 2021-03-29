import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_55Test {

    @Test
    public void canJumpA() {
        assertTrue(new Solution_55().canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void canJumpB() {
        assertFalse(new Solution_55().canJump(new int[]{3, 2, 1, 0, 4}));
    }

}