import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        // dp[i]表示s[0, i)子串能否被分解
        boolean[] dp = new boolean[s.length() + 1];
        Set<String> wordSet = new HashSet<>(wordDict);
        // 计算单词最大长度
        int maxLen = 0;
        for (String word : wordDict) {
            maxLen = Math.max(maxLen, word.length());
        }
        // 初始值：空字符串可以被分解
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            // 分解的子串s[j,i)长度不会超过maxLen，注意不能越界
            for (int j = Math.max(0, i - maxLen); j < i; j++) {
                // 递推：从i处向前遍历，s[0,j)可以分解且s[j,i)也在集合内
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
