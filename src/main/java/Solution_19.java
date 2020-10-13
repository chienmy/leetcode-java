import helper.ListNode;

public class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 在前面附加一个空的头节点可以避免删除时对是否为头节点的判断
        ListNode newHead = new ListNode(0, head);
        // 双指针
        ListNode p1 = newHead;
        ListNode p2 = newHead;
        // 向后遍历相隔n个，由于必定有解所以不用考虑异常情况
        while (n >= 0) {
            p2 = p2.next;
            n--;
        }
        // 同时向后移动，最终p1指向待删除节点的前一个节点，p2指向末尾
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        // 删除节点
        p1.next = p1.next.next;
        return newHead.next;
    }

    /* 使用Map的思路
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        int index = 0;
        while (p != null) {
            map.put(index, p);
            index ++;
            p = p.next;
        }
        int removeIndex = index - n;
        if (removeIndex == 0) {
            return head.next;
        } else {
            map.get(removeIndex - 1).next = map.get(removeIndex).next;
            return head;
        }
    }
     */
}
