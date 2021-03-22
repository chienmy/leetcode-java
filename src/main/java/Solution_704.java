public class Solution_704 {
    public int search(int[] nums, int target) {
        // 1、初始化left、right
        int left = 0;
        int right = nums.length - 1;
        // 2、处理for循环
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            // 3、比较nums[mid]和target值
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        // 4、最后剩下两个元素，手动判断
        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        } else {
            return -1;
        }
    }
}
