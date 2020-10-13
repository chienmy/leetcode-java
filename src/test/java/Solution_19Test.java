import helper.LinkListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_19Test {

    @Test
    public void removeNthFromEnd() {
        ListNode head = LinkListHelper.generateList(1, 2, 3, 4, 5);
        Assert.assertEquals(LinkListHelper.printList(new Solution_19().removeNthFromEnd(head, 2)), "1235");
    }
}