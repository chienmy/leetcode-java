import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_605Test {

    @Test
    public void canPlaceFlowersA() {
        assertTrue(new Solution_605().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    public void canPlaceFlowersB() {
        assertFalse(new Solution_605().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

}