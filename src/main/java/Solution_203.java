import helper.ListNode;

public class Solution_203 {
    public ListNode removeElements(ListNode head, int val) {
        // sentinel（哨兵）节点使链表标准化，简化插入和删除操作
        ListNode newHead = new ListNode(-1, head);
        ListNode p = newHead;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return newHead.next;
    }
}
