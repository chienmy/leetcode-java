import helper.ListNode;

public class Solution_147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        // 保存排序后的链表
        ListNode newHead = new ListNode(Integer.MIN_VALUE, head);
        ListNode p = head.next;
        head.next = null;
        // p向后遍历
        while (p != null) {
            ListNode q = newHead, next_p = p.next;
            // 移动到插入的位置
            while (q.next != null && p.val > q.next.val) {
                q = q.next;
            }
            // 插入节点
            p.next = q.next;
            q.next = p;
            p = next_p;
        }
        return newHead.next;
    }
}
