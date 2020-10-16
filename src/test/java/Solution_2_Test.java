import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_2_Test {
    @Test
    public void addTwoNumbers() {
        ListNode l1 = ListHelper.generateList(2, 4, 3);
        ListNode l2 = ListHelper.generateList(5, 6, 4);
        ListNode result = new Solution_2().addTwoNumbers(l1, l2);
        Assert.assertEquals("708", ListHelper.printList(result));
    }
}