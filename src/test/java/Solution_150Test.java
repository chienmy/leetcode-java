import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_150Test {
    @Test
    public void testA() {
        assertEquals(9, new Solution_150().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    public void testB() {
        assertEquals(6, new Solution_150().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    public void testC() {
        assertEquals(22, new Solution_150().evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}