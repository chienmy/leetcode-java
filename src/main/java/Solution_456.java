import java.util.Stack;

public class Solution_456 {

    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int[] minNums = new int[nums.length];
        int minValue = nums[0];
        // 记录左侧最小的num
        for (int i = 0; i < nums.length; i++) {
            minValue = Math.min(minValue, nums[i]);
            minNums[i] = minValue;
        }
        // 从数组尾部开始维护一个单调递减栈
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            // 首先要满足左侧存在一个更小的数
            if (nums[i] > minNums[i]) {
                // 确保栈中元素比左侧的最小值更大
                while (!stack.isEmpty() && minNums[i] >= stack.peek()) {
                    stack.pop();
                }
                // 从栈里找一个比当前数更小的数
                if (!stack.isEmpty() && stack.peek() < nums[i]) {
                    return true;
                }
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
