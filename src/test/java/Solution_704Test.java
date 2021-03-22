import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_704Test {

    @Test
    public void searchTestA() {
        assertEquals(4, new Solution_704().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    public void searchTestB() {
        assertEquals(-1, new Solution_704().search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}