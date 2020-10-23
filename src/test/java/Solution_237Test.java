import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_237Test {
    @Test
    public void deleteTestA() {
        ListNode l = ListHelper.generateList(4, 5, 1, 9);
        new Solution_237().deleteNode(l.next);
        assertEquals("419", ListHelper.printList(l));
    }

    @Test
    public void deleteTestB() {
        ListNode l = ListHelper.generateList(4, 5, 1, 9);
        new Solution_237().deleteNode(l.next.next);
        assertEquals("459", ListHelper.printList(l));
    }
}