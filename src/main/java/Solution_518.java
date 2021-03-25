public class Solution_518 {
    public int change(int amount, int[] coins) {
        // 状态 dp[i]表示金额为i时，组合的方法数
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int n : coins) {
            for (int i = n; i <= amount; i++) {
                dp[i] += dp[i - n];
            }
        }
        return dp[amount];
    }
}
