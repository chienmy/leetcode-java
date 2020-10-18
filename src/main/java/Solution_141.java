import helper.ListNode;

public class Solution_141 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head, q = head;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }
}
