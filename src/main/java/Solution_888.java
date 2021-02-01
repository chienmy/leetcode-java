import java.util.Arrays;

public class Solution_888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        Arrays.sort(B);
        int sum = 0;
        // 计算和之差
        for (int n : A) {
            sum += n;
        }
        for (int n : B) {
            sum -= n;
        }
        // 二分查找
        for (int n : A) {
            int j = Arrays.binarySearch(B, n - sum / 2);
            if (j >= 0) {
                return new int[]{n, B[j]};
            }
        }
        return new int[]{};
    }
}
