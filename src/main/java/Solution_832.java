public class Solution_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int h = A.length;
        int w = A[0].length;
        int[][] B = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                B[i][j] = 1 - A[i][w - j - 1];
            }
        }
        return B;
    }
}
