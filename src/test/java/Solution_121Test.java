import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_121Test {

    @Test
    public void maxProfitA() {
        assertEquals(5, new Solution_121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void maxProfitB() {
        assertEquals(0, new Solution_121().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}