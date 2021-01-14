import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_224 {
    public int calculate(String s) {
        Stack<String> symbolStack = new Stack<>();
        List<String> expression = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(s, "()+-", true);
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if ("+".equals(token) || "-".equals(token)) {
                while ((! symbolStack.isEmpty()) && (! "(".equals(symbolStack.peek()))) {
                    expression.add(symbolStack.pop());
                }
                symbolStack.push(token);
            } else if ("(".equals(token)) {
                symbolStack.push(token);
            } else if (")".equals(token)) {
                while (! "(".equals(symbolStack.peek())) {
                    expression.add(symbolStack.pop());
                }
                symbolStack.pop();
            } else if (! "".equals(token.trim())){
                expression.add(token.trim());
            }
        }
        while (! symbolStack.isEmpty()) {
            expression.add(String.valueOf(symbolStack.pop()));
        }
        return new Solution_150().evalRPN(expression.toArray(new String[0]));
    }
}
