public class Solution_153 {
    public int findMin(int[] nums) {
        // 思路：最后一个值作为target，然后往左移动，最后比较start、end的值
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            // 最后一个元素值为target
            if (nums[mid] > nums[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return Math.min(nums[left], nums[right]);
    }
}
