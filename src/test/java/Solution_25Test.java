import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_25Test {
    @Test
    public void reverseTestA() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4, 5);
        Assert.assertEquals(ListHelper.printList(new Solution_25().reverseKGroup(l, 2)), "21435");
    }

    @Test
    public void reverseTestB() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4, 5);
        Assert.assertEquals(ListHelper.printList(new Solution_25().reverseKGroup(l, 3)), "32145");
    }
}