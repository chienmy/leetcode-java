import java.util.ArrayList;
import java.util.List;

public class Solution_228 {
    public List<String> summaryRanges(int[] nums) {
        // 双指针解法
        List<String> result = new ArrayList<>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // 此时确定了一个[i, j]区间，注意j到达末尾的情况写在前面
            if (j == nums.length - 1 || nums[j + 1] != nums[j] + 1) {
                StringBuilder builder = new StringBuilder();
                builder.append(nums[i]);
                // 如果区间起点终点不一致则追加表示
                if (j != i) {
                    builder.append("->").append(nums[j]);
                }
                result.add(builder.toString());
                // i指向下一个区间的起点
                i = j + 1;
            }
        }
        return result;
    }
}
