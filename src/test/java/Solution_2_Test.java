import helper.LinkListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_2_Test {
    @Test
    public void addTwoNumbers() {
        ListNode l1 = LinkListHelper.generateList(2, 4, 3);
        ListNode l2 = LinkListHelper.generateList(5, 6, 4);
        ListNode result = new Solution_2().addTwoNumbers(l1, l2);
        Assert.assertEquals(LinkListHelper.printList(result), "708");
    }
}