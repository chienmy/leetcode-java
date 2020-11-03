import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_331Test {
    @Test
    public void testA() {
        assertTrue(new Solution_331().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    @Test
    public void testB() {
        assertFalse(new Solution_331().isValidSerialization("1,#"));
    }

    @Test
    public void testC() {
        assertFalse(new Solution_331().isValidSerialization("9,#,#,1"));
    }
}