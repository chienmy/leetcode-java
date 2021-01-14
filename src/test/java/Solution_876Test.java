import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_876Test {

    @Test
    public void middleNodeA() {
        ListNode head = ListHelper.generateList(1, 2, 3, 4, 5);
        assertEquals(3, new Solution_876().middleNode(head).val);
    }

    @Test
    public void middleNodeB() {
        ListNode head = ListHelper.generateList(1, 2, 3, 4, 5, 6);
        assertEquals(4, new Solution_876().middleNode(head).val);
    }

}