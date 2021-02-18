public class Solution_995 {
    public int minKBitFlips(int[] A, int K) {
        int[] diff = new int[A.length];
        int curr = 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] + curr) % 2 == 0) {
                if (i + K > A.length) {
                    return -1;
                }
                ++result;
                ++curr;
                --diff[i + K - 1];
            }
            curr += diff[i];
        }
        return result;
    }
}
