import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_148Test {
    @Test
    public void sortListTestA() {
        ListNode l = ListHelper.generateList(4, 2, 1, 3);
        assertEquals("1234", ListHelper.printList(new Solution_148().sortList(l)));
    }

    @Test
    public void sortListTestB() {
        ListNode l = ListHelper.generateList(-1, 5, 3, 4, 0);
        assertEquals("-10345", ListHelper.printList(new Solution_148().sortList(l)));
    }
}