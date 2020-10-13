import helper.ListNode;

public class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 进位标志
        int d = 0;
        // 头节点
        ListNode head = new ListNode(0);
        // 移动的节点指针
        ListNode p = head;
        while (true) {
            int a = 0;
            int b = 0;
            // 两个链表均已到头
            if (l1 == null && l2 == null) {
                // 如果仍有进位，补上一位
                if (d != 0) {
                    p.next = new ListNode(d);
                }
                // 相加结束，退出循环
                break;
            }
            // 获取l1和l2当前位的值，已经遍历到头则取0
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            // 相加得到进位和结果值
            int sum = a + b + d;
            d = sum / 10;
            // 新建并指向下一节点
            p.next = new ListNode(sum - 10 * d);
            p = p.next;
        }
        // 返回实际的链表开头
        return head.next;
    }
}