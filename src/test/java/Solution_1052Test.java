import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1052Test {
    @Test
    public void maxSatisfied() {
        assertEquals(16, new Solution_1052().maxSatisfied(
                new int[]{1, 0, 1, 2, 1, 1, 7, 5},
                new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3));
    }
}