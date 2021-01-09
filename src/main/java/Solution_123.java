public class Solution_123 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        // 四个状态分别表示买1次，买卖1次，买2次，买卖2次
        int[][] dp = new int[prices.length][4];
        // 初始状态看看做是买卖1次之后再买卖一次
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = -prices[0];
        dp[0][3] = 0;
        for (int i = 1; i < prices.length; i++) {
            // 状态转移时也要考虑同一时间段反复买卖的问题
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i][0] + prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i][1] - prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i][2] + prices[i]);
        }
        return dp[prices.length - 1][3];
    }
}
