import helper.ListNode;

public class Solution_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 分别计算两个链表的长度
        int a = getLength(l1);
        int b = getLength(l2);
        // 找到较长和较短的链表
        ListNode minList = a > b ? l2 : l1;
        ListNode maxList = a > b ? l1 : l2;
        ListNode newMinList = new ListNode(-1 , minList);
        // 较短的前面补0
        for (int i = 0; i < Math.abs(a - b); i ++) {
            newMinList.next = new ListNode(0, newMinList.next);
        }
        // 用于保存结果的链表
        ListNode sumList = new ListNode(-1, null);
        // 递归计算
        int d = addList(maxList, newMinList.next, sumList);
        // 最后有进位则补上
        if (d > 0) {
            return new ListNode(d, sumList.next);
        } else {
            return sumList.next;
        }
    }

    // 计算链表长度
    private int getLength(ListNode head) {
        int n = 0;
        while (head != null) {
            n++;
            head = head.next;
        }
        return n;
    }

    // 向后递归计算，返回进位的值
    private int addList(ListNode l1, ListNode l2, ListNode result) {
        if (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + addList(l1.next, l2.next, result);
            result.next = new ListNode(sum % 10, result.next);
            return sum / 10;
        } else {
            return 0;
        }
    }
}
