import java.util.Stack;

public class Solution_402 {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int length = num.length() - k;
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && k > 0 && num.charAt(i) < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        if (stack.isEmpty()) {
            return "0";
        }
        // 构造结果字符串
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.insert(0, stack.pop());
        }
        // 删除开头的0
        builder.delete(length, builder.length());
        while (builder.length() > 0 && builder.charAt(0) == '0') {
            builder.deleteCharAt(0);
        }
        // 如果全部为0，返回单个0
        if (builder.length() == 0) {
            return "0";
        }
        return builder.toString();
    }
}
