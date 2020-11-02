import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_445Test {
    @Test
    public void addTwoNumbers() {
        ListNode l1 = ListHelper.generateList(7, 2, 4, 3);
        ListNode l2 = ListHelper.generateList(5, 6, 4);
        assertEquals("7807", ListHelper.printList(new Solution_445().addTwoNumbers(l1, l2)));
    }
}