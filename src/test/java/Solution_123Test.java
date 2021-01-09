import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_123Test {

    @Test
    public void maxProfitA() {
        assertEquals(6, new Solution_123().maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    @Test
    public void maxProfitB() {
        assertEquals(4, new Solution_123().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }
}