import java.util.Stack;

public class Solution_394 {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // 到达一个模式的末尾
            if (s.charAt(i) == ']') {
                // 构造重复的字符串序列：出栈直到'['
                StringBuilder builder = new StringBuilder();
                while (!"[".equals(stack.peek())) {
                    builder.insert(0, stack.pop());
                }
                stack.pop();
                // 获取重复次数构造解码后的字符串
                int repeatNum = Integer.parseInt(stack.pop());
                StringBuilder repeatBuilder = new StringBuilder();
                for (; repeatNum > 0; repeatNum--) {
                    repeatBuilder.append(builder.toString());
                }
                // 入栈
                stack.push(repeatBuilder.toString());
            } else if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                // 向后读取字符获得完整的重复次数
                int repeatNum = 0;
                while (s.charAt(i) != '[') {
                    repeatNum = repeatNum * 10 + (s.charAt(i) - '0');
                    i++;
                }
                stack.push(String.valueOf(repeatNum));
                // 注意这里要将'['入栈
                stack.push("[");
            } else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        // 依次出栈获得结果
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.insert(0, stack.pop());
        }
        return builder.toString();
    }
}
