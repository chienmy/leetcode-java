import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_61Test {
    @Test
    public void rotateRightA() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4, 5);
        ListNode result = new Solution_61().rotateRight(l, 2);
        assertEquals("45123", ListHelper.printList(result));
    }

    @Test
    public void rotateRightB() {
        ListNode l = ListHelper.generateList(0, 1, 2);
        ListNode result = new Solution_61().rotateRight(l, 4);
        assertEquals("201", ListHelper.printList(result));
    }
}