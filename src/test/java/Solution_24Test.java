import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_24Test {
    @Test
    public void swapTestA() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4);
        ListNode result = new Solution_24().swapPairs(l);
        Assert.assertEquals(ListHelper.printList(result), "2143");
    }

    @Test
    public void swapTestB() {
        ListNode result = new Solution_24().swapPairs(null);
        Assert.assertEquals(ListHelper.printList(result), "");
    }

    @Test
    public void swapTestC() {
        ListNode l = ListHelper.generateList(1);
        ListNode result = new Solution_24().swapPairs(l);
        Assert.assertEquals(ListHelper.printList(result), "1");
    }
}