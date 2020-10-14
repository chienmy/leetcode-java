import helper.LinkListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_21Test {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = LinkListHelper.generateList(1, 2, 4);
        ListNode l2 = LinkListHelper.generateList(1, 3, 4);
        ListNode result = new Solution_21().mergeTwoLists(l1, l2);
        Assert.assertEquals(LinkListHelper.printList(result), "112344");
    }
}