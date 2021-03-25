public class Solution_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxLen = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    maxLen = Math.max(maxLen, dp[j] + 1);
                }
            }
            dp[i] = maxLen;
        }
        int maxNum = 0;
        for (int n : dp) {
            maxNum = Math.max(maxNum, n);
        }
        return maxNum;
    }
}
