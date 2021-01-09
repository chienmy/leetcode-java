public class Solution_122 {
    public int maxProfit(int[] prices) {
        // 动态规划：体现了状态的转移过程，在对状态的暴力搜索上优化而来
        if (prices.length < 2) {
            return 0;
        }
        // 分别表示持有现金和股票时的最大价值
        int preCrash = 0;
        int preStock = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            // 状态转移方程
            int newCrash = Math.max(preStock + prices[i], preCrash);
            int newStock = Math.max(preCrash - prices[i], preStock);
            preCrash = newCrash;
            preStock = newStock;
        }
        return preCrash;
    }
}
