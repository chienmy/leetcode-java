import helper.ListNode;

public class Solution_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(-1, head);
        ListNode p = newHead;
        // 调换节点的位置
        while (p.next != null && p.next.next != null) {
            ListNode q = p.next;
            p.next = q.next;
            q.next = q.next.next;
            p.next.next = q;
            p = q;
        }
        return newHead.next;
    }
}
