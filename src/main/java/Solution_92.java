import helper.ListNode;

public class Solution_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newHead = new ListNode(-1, head);
        ListNode p = newHead;
        // 移动到倒置开始处
        for (int i = 0; i < m - 1; i++) {
            p = p.next;
        }
        // 开始倒置
        ListNode pre = null;
        ListNode cur = p.next;
        for (int i = m; i <= n; i++) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        // 连接前后
        p.next.next = cur;
        p.next = pre;
        return newHead.next;
    }
}
