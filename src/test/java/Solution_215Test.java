import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_215Test {

    @Test
    public void findKthLargestA() {
        assertEquals(5, new Solution_215().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void findKthLargestB() {
        assertEquals(4, new Solution_215().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}