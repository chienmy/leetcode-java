import java.util.ArrayList;
import java.util.List;

public class Solution_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pMap = new int[256];
        int[] winMap = new int[256];
        int charNum = 0;
        for (char c : p.toCharArray()) {
            if (pMap[c] == 0) charNum++;
            pMap[c]++;
        }
        int left = 0;
        int right = 0;
        int match = 0;
        List<Integer> result = new ArrayList<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (pMap[c] != 0) {
                winMap[c]++;
                if (pMap[c] == winMap[c]) {
                    match++;
                }
            }

            while (match == charNum) {
                c = s.charAt(left);
                if (pMap[c] != 0) {
                    if (pMap[c] == winMap[c]) {
                        match--;
                    }
                    winMap[c]--;
                }
                if (right - left == p.length()) {
                    result.add(left);
                }
                left++;
            }

        }
        return result;
    }
}
