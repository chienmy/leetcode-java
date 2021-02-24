public class Solution_11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxNum = Math.min(height[i], height[j]) * (j - i);
        while (i < j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            maxNum = Math.max(Math.min(height[i], height[j]) * (j - i), maxNum);
        }
        return maxNum;
    }
}
