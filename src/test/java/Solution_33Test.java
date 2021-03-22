import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_33Test {

    @Test
    public void searchA() {
        assertEquals(4, new Solution_33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    public void searchB() {
        assertEquals(-1, new Solution_33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    public void searchC() {
        assertEquals(-1, new Solution_33().search(new int[]{1}, 0));
    }
}