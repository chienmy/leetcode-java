import helper.ListNode;

public class Solution_83 {
    public ListNode deleteDuplicates(ListNode head) {
        // 为空的情况
        if (head == null || head.next == null) return head;
        ListNode p = head, q = head;
        // 向后比较跳过重复节点的思路
        while (q != null) {
            if(p.val == q.val) {
                p.next = q.next;
                q = q.next;
            } else {
                p = p.next;
                q = p.next;
            }
        }
        p.next = null;
        return head;
    }
}
