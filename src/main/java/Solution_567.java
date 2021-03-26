public class Solution_567 {
    public boolean checkInclusion(String s1, String s2) {
        // 保存滑动窗口字符集
        int[] winMap = new int[256];
        // 保存需要出现的字符集
        int[] tMap = new int[256];
        for (char c : s1.toCharArray()) {
            tMap[c]++;
        }
        // 计算共出现了多少不同的字符
        int charNum = 0;
        for (int n : tMap) {
            if (n > 0) {
                charNum++;
            }
        }
        int left = 0;
        int right = 0;
        int match = 0;


        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            if (tMap[c] != 0) {
                winMap[c]++;
                if (winMap[c] == tMap[c]) {
                    match++;
                }
            }

            boolean matched = (match == charNum);
            while (match == charNum) {
                c = s2.charAt(left);
                if (tMap[c] != 0) {
                    if (winMap[c] == tMap[c]) {
                        match--;
                    }
                    winMap[c]--;
                }
                left++;
            }

            if (matched && right - left + 1 == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
