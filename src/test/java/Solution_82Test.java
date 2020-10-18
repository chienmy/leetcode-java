import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution_82Test {
    @Test
    public void deleteDuplicatesA() {
        ListNode l = ListHelper.generateList(1, 2, 3, 3, 4, 4, 5);
        Assert.assertEquals("125", ListHelper.printList(new Solution_82().deleteDuplicates(l)));
    }

    @Test
    public void deleteDuplicatesB() {
        ListNode l = ListHelper.generateList(1, 1, 1, 2, 3);
        Assert.assertEquals("23", ListHelper.printList(new Solution_82().deleteDuplicates(l)));
    }
}