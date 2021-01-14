import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_224Test {
    @Test
    public void calculateTestA() {
        assertEquals(2, new Solution_224().calculate("1 + 1"));
    }

    @Test
    public void calculateTestB() {
        assertEquals(3, new Solution_224().calculate("   (  3 ) "));
    }

    @Test
    public void calculateTestC() {
        assertEquals(23, new Solution_224().calculate(" (1+(4+5+2)-3)+(6+8)"));
    }
}