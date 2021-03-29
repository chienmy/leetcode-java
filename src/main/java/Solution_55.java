public class Solution_55 {
    public boolean canJump(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            // 当前格子已经无法跳到
            if (i > maxLen) return false;
            // 更新能跳到的最远距离
            maxLen = Math.max(maxLen, i + nums[i]);
        }
        return true;
    }
}
