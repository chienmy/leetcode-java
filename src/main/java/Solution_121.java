public class Solution_121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        // 反向遍历，记录每个元素右方的最大值
        int[] maxRight = new int[prices.length];
        int maxValue = prices[prices.length - 1];
        for (int i = maxRight.length - 1; i >= 0; i--) {
            maxValue = Math.max(maxValue, prices[i]);
            maxRight[i] = maxValue;
        }
        // 正向遍历，记录元素与右方最大值差值的最大值
        maxValue = 0;
        for (int i = 0; i < prices.length; i++) {
            maxValue = Math.max(maxValue, maxRight[i] - prices[i]);
        }
        return maxValue;
    }
}
