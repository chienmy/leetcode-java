public class Solution_867 {
    public int[][] transpose(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        int[][] result = new int[w][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
