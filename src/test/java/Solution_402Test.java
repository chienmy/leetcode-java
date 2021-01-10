import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_402Test {

    @Test
    public void removeKdigitsA() {
        assertEquals("1219", new Solution_402().removeKdigits("1432219", 3));
    }

    @Test
    public void removeKdigitsB() {
        assertEquals("200", new Solution_402().removeKdigits("10200", 1));
    }

    @Test
    public void removeKdigitsC() {
        assertEquals("0", new Solution_402().removeKdigits("10", 2));
    }
}