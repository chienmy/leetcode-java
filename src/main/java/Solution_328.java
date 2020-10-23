import helper.ListNode;

public class Solution_328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd_p = head, even_p = head.next, evenHead = head.next;
        while (even_p != null) {
            if (odd_p.next == even_p) {
                // 奇数项指针下一跳为null时
                if (even_p.next == null) {
                    // 将下一项指向偶数项链表的开头
                    odd_p.next = evenHead;
                    return head;
                }
                // 否则将奇数项指针向后移动
                else {
                    odd_p.next = even_p.next;
                    odd_p = odd_p.next;
                }
            }
            // 偶数项指针向后移动
            else if (even_p.next == odd_p) {
                even_p.next = odd_p.next;
                even_p = even_p.next;
            }
        }
        // 这时直接将奇数项指针的下一项指向偶数项链表的开头
        odd_p.next = evenHead;
        return head;
    }
}
