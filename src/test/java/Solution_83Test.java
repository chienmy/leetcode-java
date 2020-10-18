import helper.ListHelper;
import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_83Test {
    @Test
    public void deleteDuplicatesA() {
        ListNode l = ListHelper.generateList(1, 1, 2);
        Assert.assertEquals("12", ListHelper.printList(new Solution_83().deleteDuplicates(l)));
    }

    @Test
    public void deleteDuplicatesB() {
        ListNode l = ListHelper.generateList(1, 1, 2, 3, 3);
        Assert.assertEquals("123", ListHelper.printList(new Solution_83().deleteDuplicates(l)));
    }
}