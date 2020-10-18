import helper.ListNode;

public class Solution_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(-1, head);
        ListNode pre = newHead, p = head;
        // 使用n记录重复元素个数
        int n = 0;
        while (p != null) {
            if(pre.next.val == p.val) {
                n++;
                p = p.next;
            } else {
                // 出现重复时特殊处理
                if (n < 2) {
                    pre = pre.next;
                } else {
                    pre.next = p;
                }
                n = 0;
            }
        }
        // 最后处理结束后的末尾
        if (n < 2) {
            pre = pre.next;
        }
        pre.next = null;
        return newHead.next;
    }
}
