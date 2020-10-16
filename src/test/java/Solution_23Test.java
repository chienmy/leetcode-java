import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_23Test {
    @Test
    public void mergeTestA() {
        ListNode l1 = ListHelper.generateList(1, 4, 5);
        ListNode l2 = ListHelper.generateList(1, 3, 4);
        ListNode l3 = ListHelper.generateList(2, 6);
        ListNode result = new Solution_23().mergeKLists(new ListNode[]{l1, l2, l3});
        Assert.assertEquals("11234456", ListHelper.printList(result));
    }

    @Test
    public void mergeTestB() {
        ListNode result = new Solution_23().mergeKLists(new ListNode[]{});
        Assert.assertEquals("", ListHelper.printList(result));
    }

    @Test
    public void mergeTestC() {
        ListNode result = new Solution_23().mergeKLists(new ListNode[]{null});
        Assert.assertEquals("", ListHelper.printList(result));
    }
}