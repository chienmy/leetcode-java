import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_20Test {
    @Test
    public void testA() {
        assertTrue(new Solution_20().isValid("()"));
    }

    @Test
    public void testB() {
        assertTrue(new Solution_20().isValid("()[]{}"));
    }

    @Test
    public void testC() {
        assertFalse(new Solution_20().isValid("(]"));
    }

    @Test
    public void testD() {
        assertFalse(new Solution_20().isValid("([)]"));
    }

    @Test
    public void testE() {
        assertTrue(new Solution_20().isValid("{[]}"));
    }
}