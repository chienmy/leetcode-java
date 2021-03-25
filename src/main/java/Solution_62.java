public class Solution_62 {
    public int uniquePaths(int m, int n) {
        // dp[i][j] 表示0,0到i,j的路径数
        int[] dp = new int[n];
        // 初始化：到达第一行的路径数均为1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 每行第一个格子只有一条路到达
                if (j == 0) {
                    dp[j] = 1;
                }
                // 其他格子可以由左侧或上方的格子到达
                else {
                    dp[j] = dp[j-1] + dp[j];
                }
            }
        }
        return dp[n-1];
    }
}
