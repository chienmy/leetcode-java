import java.util.Stack;

public class Solution_85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        // arr存放每行中每个元素上方的最大柱状矩形高度，每行前后补0
        int[][] arr = new int[rows][cols + 2];
        for (int i = 0; i < cols; i++) {
            arr[0][i + 1] = matrix[0][i] == '1' ? 1 : 0;
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j + 1] = matrix[i][j] == '1' ? arr[i - 1][j + 1] + 1 : 0;
            }
        }
        // 对于每一行转换为#84中的处理方法
        int result = 0;
        for (int i = 0; i < rows; i++) {
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            for (int j = 1; j < arr[i].length; j++) {
                while (!stack.isEmpty() && arr[i][stack.peek()] > arr[i][j]) {
                    int outElement = stack.pop();
                    int topElement = stack.peek();
                    result = Math.max(result, arr[i][outElement] * (j - topElement - 1));
                }
                stack.push(j);
            }
        }
        return result;
    }
}
