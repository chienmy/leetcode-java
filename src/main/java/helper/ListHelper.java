package helper;

public class ListHelper {
    public static ListNode generateList(int... arr) {
        ListNode head = new ListNode();
        ListNode p = head;
        for (int n : arr) {
            p.next = new ListNode(n);
            p = p.next;
        }
        return head.next;
    }

    public static ListNode generateCycleList(int pos, int... arr) {
        ListNode head = new ListNode();
        ListNode p = head, q = null;
        for (int i = 0; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
            if (i == pos) {
                q = p;
            }
        }
        if (q != null) {
            p.next = q;
        }
        return head.next;
    }

    public static String printList(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }
        return builder.toString();
    }
}
