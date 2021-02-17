public class Solution_566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] matrix = new int[r][c];
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int rp = 0;
        int cp = 0;
        for (int[] row : nums) {
            for (int num : row) {
                if (cp == c) {
                    rp++;
                    cp = 0;
                }
                matrix[rp][cp] = num;
                cp++;
            }
        }
        return matrix;
    }
}
