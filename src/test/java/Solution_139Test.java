import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution_139Test {

    @Test
    public void wordBreakA() {
        assertTrue(new Solution_139().wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    public void wordBreakB() {
        assertTrue(new Solution_139().wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void wordBreakC() {
        assertFalse(new Solution_139().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }
}