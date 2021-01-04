import java.util.Iterator;
import java.util.LinkedList;

public class Solution_71 {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for (String s : paths) {
            if (s.isEmpty() || ".".equals(s)) {
                continue;
            } else if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else {
                stack.addLast(s);
            }
        }
        StringBuilder builder = new StringBuilder("/");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next());
            if (iterator.hasNext()) {
                builder.append("/");
            }
        }
        return builder.toString();
    }
}
