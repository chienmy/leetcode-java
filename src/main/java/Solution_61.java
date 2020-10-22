import helper.ListNode;

public class Solution_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode p = head;
        // 计算链表长度
        int n = 1;
        while (p.next != null) {
            n++;
            p = p.next;
        }
        // 分割成两部分
        ListNode tail = p;
        p = head;
        for (int i = 1; i < n - k % n; i++) {
            p = p.next;
        }
        // 再拼接
        tail.next = head;
        ListNode newHead = p.next;
        p.next = null;
        return newHead;
    }
}
