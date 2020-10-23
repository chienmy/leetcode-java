import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_328Test {
    @Test
    public void oddEvenListTestA() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4, 5);
        ListNode result = new Solution_328().oddEvenList(l);
        assertEquals("13524", ListHelper.printList(result));
    }

    @Test
    public void oddEvenListTestB() {
        ListNode l = ListHelper.generateList(2, 1, 3, 5, 6, 4, 7);
        ListNode result = new Solution_328().oddEvenList(l);
        assertEquals("2367154", ListHelper.printList(result));
    }
}