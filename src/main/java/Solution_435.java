import java.util.Arrays;
import java.util.Comparator;

public class Solution_435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        // 贪心算法 - 区间调度问题
        // 按终点升序排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int index = 0;
        int result = 0;
        while (index < intervals.length) {
            // 记录当前的终点位置
            int nextStart = intervals[index][1];
            // 找到下一个可选择的区间
            while (index < intervals.length && intervals[index][0] < nextStart) {
                index++;
            }
            // 不重叠区间计数+1
            result++;
        }
        // 区间总数与之相减即为删除的区间数
        return intervals.length - result;
    }

}
