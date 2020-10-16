import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_206Test {
    @Test
    public void reverseList() {
        ListNode l = ListHelper.generateList(1, 2, 3, 4, 5);
        ListNode result = new Solution_206().reverseList(l);
        Assert.assertEquals("54321", ListHelper.printList(result));
    }
}