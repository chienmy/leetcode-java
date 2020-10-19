import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_92Test {
    @Test
    public void reverseBetween() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4, 5);
        ListNode result = new Solution_92().reverseBetween(l, 2, 4);
        assertEquals("14325", ListHelper.printList(result));
    }
}