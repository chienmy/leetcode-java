public class Solution_45 {
    public int jump(int[] nums) {
        int steps = 0;
        int start = 0;
        int end = 1;
        while (end < nums.length) {
            // 确定最远的跳跃范围
            int maxPosition = 0;
            for (int i = start; i < end; i++) {
                maxPosition = Math.max(maxPosition, i + nums[i]);
            }
            start = end;
            end = maxPosition + 1;
            // 步数增加
            steps++;
        }
        return steps;
    }
}
