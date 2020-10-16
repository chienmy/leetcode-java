import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_21Test {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = ListHelper.generateList(1, 2, 4);
        ListNode l2 = ListHelper.generateList(1, 3, 4);
        ListNode result = new Solution_21().mergeTwoLists(l1, l2);
        Assert.assertEquals("112344", ListHelper.printList(result));
    }
}