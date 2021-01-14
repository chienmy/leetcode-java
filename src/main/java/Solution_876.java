import helper.ListNode;

public class Solution_876 {

    public ListNode middleNode(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }

}
