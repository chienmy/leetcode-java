import helper.LinkListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_23Test {
    @Test
    public void mergeTestA() {
        ListNode l1 = LinkListHelper.generateList(1, 4, 5);
        ListNode l2 = LinkListHelper.generateList(1, 3, 4);
        ListNode l3 = LinkListHelper.generateList(2, 6);
        ListNode result = new Solution_23().mergeKLists(new ListNode[]{l1, l2, l3});
        Assert.assertEquals(LinkListHelper.printList(result), "11234456");
    }

    @Test
    public void mergeTestB() {
        ListNode result = new Solution_23().mergeKLists(new ListNode[]{});
        Assert.assertEquals(LinkListHelper.printList(result), "");
    }

    @Test
    public void mergeTestC() {
        ListNode result = new Solution_23().mergeKLists(new ListNode[]{null});
        Assert.assertEquals(LinkListHelper.printList(result), "");
    }
}