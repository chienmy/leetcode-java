import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_122Test {

    @Test
    public void maxProfitA() {
        assertEquals(7, new Solution_122().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void maxProfitB() {
        assertEquals(4, new Solution_122().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }
}