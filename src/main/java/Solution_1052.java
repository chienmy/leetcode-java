public class Solution_1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int sum = 0;
        for (int i = 0; i < X; i++) {
            if (grumpy[i] == 1) {
                sum += customers[i];
            }
        }
        int maxNum = sum;
        for (int i = 0; i < grumpy.length - X; i++) {
            // 代替if判断可以显著提高速度
            sum -= grumpy[i] * customers[i];
            sum += grumpy[i + X] * customers[i + X];
            maxNum = Math.max(sum, maxNum);
        }
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                maxNum += customers[i];
            }
        }
        return maxNum;
    }
}
