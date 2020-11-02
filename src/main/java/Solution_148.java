import helper.ListNode;

public class Solution_148 {
    public ListNode sortList(ListNode head) {
        // 空链表或者只有单个结点
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;
        // 使用快慢指针寻找中间结点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null)
                fast = fast.next;
        }
        ListNode ptr1 = slow.next;
        slow.next = null;
        //递归排序前一段链表
        ListNode tmp1 = sortList(head);
        //递归排序后一段链表
        ListNode tmp2 = sortList(ptr1);
        // 合并得到最终结果
        return merge(tmp1, tmp2);
    }

    // 合并两个有序链表
    public static ListNode merge(ListNode start1, ListNode start2) {
        ListNode header = new ListNode(-1);
        ListNode pre = header;

        ListNode ptr1 = start1, ptr2 = start2;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val <= ptr2.val) {
                pre.next = ptr1;
                pre = ptr1;
                ptr1 = ptr1.next;
            } else {
                pre.next = ptr2;
                pre = ptr2;
                ptr2 = ptr2.next;
            }
        }
        while (ptr1 != null) {
            pre.next = ptr1;
            pre = ptr1;
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            pre.next = ptr2;
            pre = ptr2;
            ptr2 = ptr2.next;
        }
        return header.next;
    }
}
