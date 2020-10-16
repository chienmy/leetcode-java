import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_19Test {

    @Test
    public void removeNthFromEnd() {
        ListNode head = ListHelper.generateList(1, 2, 3, 4, 5);
        Assert.assertEquals("1235", ListHelper.printList(new Solution_19().removeNthFromEnd(head, 2)));
    }
}