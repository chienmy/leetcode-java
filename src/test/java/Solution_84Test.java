import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_84Test {
    @Test
    public void largestRectangleArea() {
        assertEquals(10, new Solution_84().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}