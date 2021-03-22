public class Solution_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 思路：将2维数组转为1维数组 进行二分搜索
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            // 获取2维数组对应值
            int val = matrix[mid/col][mid%col];
            if (val < target) {
                left = mid;
            } else if (val > target) {
                right = mid;
            } else {
                return true;
            }
        }
        if (matrix[left/col][left%col] == target || matrix[right/col][right%col] == target) {
            return true;
        }
        return false;
    }
}
