import helper.ListNode;

public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        // 计算两个链表的长度
        int a = 0, b = 0;
        while (p != null) {
            p = p.next;
            a++;
        }
        while (q != null) {
            q = q.next;
            b++;
        }
        // 分别指向较长和较短的链表
        ListNode max_p = a > b ? headA : headB;
        ListNode min_p = a > b ? headB : headA;
        // 较长的链表向后移动差值
        for (int i = 0; i < Math.abs(a - b); i++) {
            max_p = max_p.next;
        }
        // 然后同时向后移动，相遇即为相交节点
        while (max_p != null && min_p != null) {
            if (max_p == min_p) return max_p;
            max_p = max_p.next;
            min_p = min_p.next;
        }
        // 否则说明没有相交节点，返回null
        return null;
    }
}
