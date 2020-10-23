import helper.ListHelper;
import helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_234Test {
    @Test
    public void palindromeTestA() {
        ListNode l = ListHelper.generateList(1, 2);
        assertFalse(new Solution_234().isPalindrome(l));
    }

    @Test
    public void palindromeTestB() {
        ListNode l = ListHelper.generateList(1, 2, 2, 1);
        assertTrue(new Solution_234().isPalindrome(l));
    }
}