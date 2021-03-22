public class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        // 思路：找到第一个 >= target 的元素位置
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (nums[left] >= target) {
            return left;
        } else if (nums[left] < target && target <= nums[right]) {
            return left + 1;
        } else {
            // 目标值比所有值都大
            return right + 1;
        }
    }
}
