import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_316Test {

    @Test
    public void removeDuplicateLettersA() {
        assertEquals("abc", new Solution_316().removeDuplicateLetters("bcabc"));
    }

    @Test
    public void removeDuplicateLettersB() {
        assertEquals("acdb", new Solution_316().removeDuplicateLetters("cbacdcbc"));
    }
}