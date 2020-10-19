import helper.ListNode;

public class Solution_143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        // 通过快慢指针找到链表中点
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p = head;
        // 将后半段倒置顺序
        ListNode q = reverseList(slow.next);
        // 记得将前半段拆分出来
        slow.next = null;
        // 合并前半段和倒置后的后半段
        while (p != null && q != null) {
            ListNode qNext = q.next;
            q.next = p.next;
            p.next = q;
            p = q.next;
            q = qNext;
        }
    }

    // 206中的倒置方法
    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
