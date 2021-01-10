import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_228Test {


    @Test
    public void summaryRangesA() {
        assertEquals("[0->2, 4->5, 7]", new Solution_228().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}).toString());
    }

    @Test
    public void summaryRangesB() {
        assertEquals("[0, 2->4, 6, 8->9]", new Solution_228().summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}).toString());
    }

    @Test
    public void summaryRangesC() {
        assertEquals("[]", new Solution_228().summaryRanges(new int[]{}).toString());
    }
}