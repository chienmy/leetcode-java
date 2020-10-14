import helper.ListNode;

public class Solution_21 {
    // Tips：除此之外还有递归解法
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            // 指向较小节点的指针才会向后移动
            // 较小的节点将加入新生成的链表
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        // 其中一个遍历到底之后，直接将另一个剩下的部分接在后面
        p.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
