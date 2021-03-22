public class Solution_33 {
    public int search(int[] nums, int target) {
        // 思路：四种情况判断
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            // 相等直接返回
            if (nums[mid] == target) {
                return mid;
            }
            // 判断在哪个区间，可能分为四种情况
            if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid;
                }
            } else if (nums[right] > nums[mid]) {
                if (nums[right] >= target && target >= nums[mid]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
        }
        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        }
        return -1;
    }
}
