import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_76Test {

    @Test
    public void minWindowA() {
        assertEquals("BANC", new Solution_76().minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void minWindowB() {
        assertEquals("a", new Solution_76().minWindow("a", "a"));
    }
}