import helper.ListNode;

public class Solution_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, pre = null;
        // 慢指针遍历时顺便把前半部分链表翻转
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        // 奇数个数时跳过中点
        if (fast != null){
            slow = slow.next;
        }
        // 按序遍历两个链表，出现不同的值说明不是回文
        while (slow != null) {
            if (slow.val != pre.val) return false;
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
