import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_81Test {

    @Test
    public void search() {
        assertTrue(new Solution_81().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        assertFalse(new Solution_81().search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }
}