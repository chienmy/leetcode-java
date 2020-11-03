import java.util.Stack;

public class Solution_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // 在压栈时就存入对应的右括号
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            // 取元素前必须判断非空
            else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /*
    // 压栈 - 取元素 - 匹配
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char k = stack.pop();
                if (! ((k == '(' && c == ')') || (k == '[' && c == ']') || (k == '{' && c == '}'))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    */
}
