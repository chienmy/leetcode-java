import java.util.*;
import java.util.stream.Collectors;

public class Solution_84 {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        List<Integer> heightList = Arrays.stream(heights).boxed().collect(Collectors.toList());
        heightList.add(0);
        heightList.add(0, 0);
        for (int i = 1; i < heightList.size(); i++) {
            while (heightList.get(stack.peek()) > heightList.get(i)) {
                int outElement = stack.pop();
                int newTopElement = stack.peek();
                result = Math.max(result, (i - newTopElement - 1) * heightList.get(outElement));
            }
            stack.push(i);
        }
        return result;
    }

    private int myLargestRectangleArea(int[] heights) {
        int minHeight = Arrays.stream(heights).min().getAsInt();
        int start = 0, p = 0;
        List<Integer> areas = new ArrayList<>();
        areas.add(minHeight * heights.length);
        while (p < heights.length) {
            if (heights[p] == minHeight) {
                if (p > start) {
                    areas.add(largestRectangleArea(Arrays.copyOfRange(heights, start, p)));
                }
                start = p + 1;
            }
            p++;
        }
        if (p > start) {
            areas.add(largestRectangleArea(Arrays.copyOfRange(heights, start, p)));
        }
        return Collections.max(areas);
    }
}
