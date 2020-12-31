import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_205Test {

    @Test
    public void isIsomorphicTestA() {
        assertTrue(new Solution_205().isIsomorphic("egg", "add"));
    }

    @Test
    public void isIsomorphicTestB() {
        assertFalse(new Solution_205().isIsomorphic("foo", "bar"));
    }

    @Test
    public void isIsomorphicTestC() {
        assertTrue(new Solution_205().isIsomorphic("paper", "title"));
    }

}