import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_86Test {
    @Test
    public void partition() {
        ListNode l = ListHelper.generateList(1, 4, 3, 2, 5, 2);
        ListNode result = new Solution_86().partition(l, 3);
        assertEquals("122435", ListHelper.printList(result));
    }
}