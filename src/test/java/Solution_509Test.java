import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_509Test {

    @Test
    public void fib() {
        assertEquals(0, new Solution_509().fib(0));
        assertEquals(2, new Solution_509().fib(3));
        assertEquals(5, new Solution_509().fib(5));
    }
}