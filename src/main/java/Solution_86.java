import helper.ListNode;

public class Solution_86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(-1, head);
        ListNode bigList = new ListNode(-1);
        // 指向小数链表、遍历原链表、指向大数链表的指针
        ListNode small_p = newHead, p = head, big_p = bigList;
        while (p != null) {
            // 比较值的大小，将节点链接入不同的链表
            if (p.val < x) {
                small_p.next = p;
                small_p = p;
            } else {
                big_p.next = p;
                big_p = p;
            }
            p = p.next;
        }
        small_p.next = bigList.next;
        // 最后大数链表的末尾要指向null
        big_p.next = null;
        return newHead.next;
    }
}
