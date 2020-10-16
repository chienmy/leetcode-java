import helper.ListNode;

public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(-1, head);
        ListNode pre = null, p = newHead, next = newHead.next;
        while (next != null) {
            p = next;
            next = next.next;
            p.next = pre;
            pre = p;
        }
        return p;
    }
}
