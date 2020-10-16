import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_203Test {
    @Test
    public void removeElements() {
        ListNode l = ListHelper.generateList(1, 2, 6, 3, 4, 5, 6);
        ListNode result = new Solution_203().removeElements(l, 6);
        Assert.assertEquals(ListHelper.printList(result), "12345");
    }
}