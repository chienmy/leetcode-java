public class Solution_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        // 初始化：遇到障碍前仅有一条路，之后全为0
        dp[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[i] = 0;
            } else {
                dp[i] = dp[i-1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 当前格是障碍，不可达，置为0
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                    continue;
                }
                if (j > 0) {
                    dp[j] = dp[j-1] + dp[j];
                }
            }
        }
        return dp[n-1];
    }
}
