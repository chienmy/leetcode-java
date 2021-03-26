import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_567Test {

    @Test
    public void checkInclusionA() {
        assertTrue(new Solution_567().checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void checkInclusionB() {
        assertFalse(new Solution_567().checkInclusion("ab", "eidboaoo"));
    }
}