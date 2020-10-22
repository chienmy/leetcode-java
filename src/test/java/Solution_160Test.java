import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_160Test {
    @Test
    public void getIntersectionNodeTestA() {
        ListNode l1 = ListHelper.generateList(4, 1, 8, 4, 5);
        ListNode l2 = ListHelper.generateList(5, 0, 1);
        l2.next.next.next = l1.next.next;
        assertEquals(8, new Solution_160().getIntersectionNode(l1, l2).val);
    }

    @Test
    public void getIntersectionNodeTestB() {
        ListNode l1 = ListHelper.generateList(3, 2, 4);
        ListNode l2 = ListHelper.generateList(0, 9, 1);
        l2.next.next.next = l1.next;
        assertEquals(2, new Solution_160().getIntersectionNode(l1, l2).val);
    }

    @Test
    public void getIntersectionNodeTestC() {
        ListNode l1 = ListHelper.generateList(2, 6, 4);
        ListNode l2 = ListHelper.generateList(1, 5);
        assertNull(new Solution_160().getIntersectionNode(l1, l2));
    }
}