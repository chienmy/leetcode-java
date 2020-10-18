import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_141Test {
    @Test
    public void hasCycle() {
        ListNode l = ListHelper.generateCycleList(1, 3, 2, 0, -4);
        assertTrue(new Solution_141().hasCycle(l));
    }

    @Test
    public void hasCycleB() {
        ListNode l = ListHelper.generateCycleList(0, 1, 2);
        assertTrue(new Solution_141().hasCycle(l));
    }

    @Test
    public void hasCycleC() {
        ListNode l = ListHelper.generateCycleList(-1, 1);
        assertFalse(new Solution_141().hasCycle(l));
    }
}