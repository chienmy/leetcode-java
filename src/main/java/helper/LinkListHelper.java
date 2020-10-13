package helper;

public class LinkListHelper {
    public static ListNode generateList(int... arr) {
        ListNode head = new ListNode();
        ListNode p = head;
        for (int n : arr) {
            p.next = new ListNode(n);
            p = p.next;
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
