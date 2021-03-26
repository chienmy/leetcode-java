public class Solution_76 {
    public String minWindow(String s, String t) {
        int[] tMap = new int[256];
        int[] winMap = new int[256];
        for (char c : t.toCharArray()) {
            tMap[c]++;
        }
        int charNum = 0;
        for (int n : tMap) {
            if (n > 0) {
                charNum++;
            }
        }
        int left = 0;
        int right = 0;
        int match = 0;
        int start = 0;
        int end = 0;
        int minValue = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (tMap[c] != 0) {
                winMap[c]++;
                if (tMap[c] == winMap[c]) {
                    match++;
                }
            }
            right++;

            while (match == charNum) {
                if (right - left < minValue) {
                    minValue = right - left;
                    start = left;
                    end = right;
                }
                char leftChar = s.charAt(left);
                if (tMap[leftChar] != 0) {
                    if (winMap[leftChar] == tMap[leftChar]) {
                        match--;
                    }
                    winMap[leftChar]--;
                }
                left++;
            }
        }
        if (minValue == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, end);
    }
}
