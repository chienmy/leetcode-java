import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_142Test {
    @Test
    public void hasCycle() {
        ListNode l = ListHelper.generateCycleList(1, 3, 2, 0, -4);
        assertEquals(2, new Solution_142().detectCycle(l).val);
    }

    @Test
    public void hasCycleB() {
        ListNode l = ListHelper.generateCycleList(0, 1, 2);
        assertEquals(1, new Solution_142().detectCycle(l).val);
    }

    @Test
    public void hasCycleC() {
        ListNode l = ListHelper.generateCycleList(-1, 1);
        assertNull(new Solution_142().detectCycle(l));
    }
}