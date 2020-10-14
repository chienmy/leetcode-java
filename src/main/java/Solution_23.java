import helper.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists, int begin, int end) {
        if (begin == end)
            return lists[begin];
        if (begin > end)
            return null;
        int mid = (begin + end) >> 1;
        return new Solution_21().mergeTwoLists(merge(lists, begin, mid), merge(lists, mid + 1, end));
    }

    /*
    // 思路：使用最小堆优化找最小值的过程
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        // 重写最小堆的比较函数
        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        // 将所有链表的头节点加入堆中
        for (ListNode node : lists) {
            if (node != null) {
                heap.add(node);
            }
        }
        while (! heap.isEmpty()) {
            // 取出最小的节点加入新链表
            ListNode minNode = heap.poll();
            p.next = minNode;
            p = p.next;
            // 并将其下一个节点加入堆中
            if (minNode.next != null) {
                heap.add(minNode.next);
            }
        }
        return head.next;
    }
    */


    /*
    // 思路：依次比较每个链表找最小值
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (true) {
            boolean flag = false;
            int minValue = 100001;
            int index = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < minValue) {
                    minValue = lists[i].val;
                    index = i;
                }
            }
            if (index < 0) {
                break;
            } else {
                p.next = lists[index];
                lists[index] = lists[index].next;
                p = p.next;
            }
        }
        return head.next;
    }
    */
}
