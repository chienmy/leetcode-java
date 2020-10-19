import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_143Test {
    @Test
    public void reorderTestA() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4);
        new Solution_143().reorderList(l);
        assertEquals("1423", ListHelper.printList(l));
    }

    @Test
    public void reorderTestB() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4, 5);
        new Solution_143().reorderList(l);
        assertEquals("15243", ListHelper.printList(l));
    }
}