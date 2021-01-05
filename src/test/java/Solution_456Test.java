import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_456Test {

    @Test
    public void find132patternA() {
        assertFalse(new Solution_456().find132pattern(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void find132patternB() {
        assertTrue(new Solution_456().find132pattern(new int[]{3, 1, 4, 2}));
    }

}