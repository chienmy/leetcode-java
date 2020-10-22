import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_147Test {
    @Test
    public void insertionSortA() {
        ListNode l = ListHelper.generateList(4, 2, 1, 3);
        ListNode result = new Solution_147().insertionSortList(l);
        assertEquals("1234", ListHelper.printList(result));
    }

    @Test
    public void insertionSortB() {
        ListNode l = ListHelper.generateList(-1, 5, 3, 4, 0);
        ListNode result = new Solution_147().insertionSortList(l);
        assertEquals("-10345", ListHelper.printList(result));
    }
}