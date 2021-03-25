import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1143Test {

    @Test
    public void testA() {
        assertEquals(3, new Solution_1143().longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void testB() {
        assertEquals(3, new Solution_1143().longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void testC() {
        assertEquals(0, new Solution_1143().longestCommonSubsequence("abc", "def"));
    }
}