import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_830 {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        if (s.isEmpty()) {
            return result;
        }
        char c = s.charAt(0);
        int n = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n++;
            } else {
                if (n >= 3) {
                    result.add(Arrays.asList(i - n, i - 1));
                }
                c = s.charAt(i);
                n = 1;
            }
        }
        // 此处注意处理末尾扫描完成之后的情况
        if (n >= 3) {
            result.add(Arrays.asList(s.length() - n, s.length() - 1));
        }
        return result;
    }

}
