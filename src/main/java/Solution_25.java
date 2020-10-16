import helper.ListNode;

public class Solution_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        // k=1时意味着不用翻转
        if (k == 1) return head;
        ListNode p = head, q = head;
        // 使用q向后遍历，不成一组则无需操作，直接返回头节点
        for (int i = 0; i < k; i++) {
            if (q == null) {
                return head;
            }
            q = q.next;
        }
        // 翻转k个节点
        ListNode pre = null;
        ListNode next = null;
        for (int i = 0; i < k; i++){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        // 递归，将原来的头节点，也就是现在的尾节点，指向下一个递归返回的结果
        p.next = reverseKGroup(head, k);
        return pre;
    }
}
