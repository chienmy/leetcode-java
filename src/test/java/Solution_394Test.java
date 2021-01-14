import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_394Test {
    @Test
    public void decodeStringA() {
        assertEquals("aaabcbc", new Solution_394().decodeString("3[a]2[bc]"));
    }

    @Test
    public void decodeStringB() {
        assertEquals("accaccacc", new Solution_394().decodeString("3[a2[c]]"));
    }

    @Test
    public void decodeStringC() {
        assertEquals("abcabccdcdcdef", new Solution_394().decodeString("2[abc]3[cd]ef"));
    }
}