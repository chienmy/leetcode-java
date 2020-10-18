import helper.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head, q = head;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                ListNode m = head;
                while (m != p) {
                    m = m.next;
                    p = p.next;
                }
                return p;
            }
        }
        return null;
    }

    /*
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        Set<ListNode> set = new HashSet<>();
        while (p != null) {
            if (set.contains(p)) {
                return p;
            } else {
                set.add(p);
                p = p.next;
            }
        }
        return null;
    }
     */
}
