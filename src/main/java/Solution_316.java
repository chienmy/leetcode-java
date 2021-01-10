import java.util.Stack;

public class Solution_316 {
    public String removeDuplicateLetters(String s) {
        if (s.length() < 2) {
            return s;
        }
        // counts数组记录字母出现的次数
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        // visited数组记录字母是否在栈中出现过
        int[] visited = new int[26];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // 字母没有在栈中出现过
            if (visited[s.charAt(i) - 'a'] == 0) {
                // 栈不为空 and 比栈顶元素小 && 字母仍有剩余 -> 出栈 && 将出栈元素设为未出现过
                while (!stack.isEmpty() && s.charAt(i) < stack.peek() && counts[stack.peek() - 'a'] > 0) {
                    visited[stack.pop() - 'a'] = 0;
                }
                visited[s.charAt(i) - 'a'] = 1;
                stack.push(s.charAt(i));
            }
            // 计数减一
            counts[s.charAt(i) - 'a']--;
        }
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }
}
