import java.util.*;

public class Solution_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        for (String s : tokens) {
            // 遇到运算符，出栈，计算，结果入栈
            if (operators.contains(s)) {
                int a = stack.pop();
                int b = stack.pop();
                if ("+".equals(s)) stack.push(b + a);
                else if ("-".equals(s)) stack.push(b - a);
                else if ("*".equals(s)) stack.push(b * a);
                else if ("/".equals(s)) stack.push(b / a);
            }
            // 遇到数字，入栈
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        // 栈中最后剩余的数字即为结果
        return stack.pop();
    }
}
