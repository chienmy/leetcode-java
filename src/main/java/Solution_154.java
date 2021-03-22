public class Solution_154 {
    public int findMin(int[] nums) {
        // 思路：跳过重复元素，mid值和end值比较，分为两种情况进行处理
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            // 去除重复元素
            while (left < right && nums[right] == nums[right - 1]) {
                right--;
            }
            while (left < right && nums[left] == nums[left + 1]) {
                left++;
            }
            int mid = left + (right - left) / 2;
            // 中间元素和最后一个元素比较（判断中间点落在左边上升区，还是右边上升区）
            if (nums[mid] > nums[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return Math.min(nums[left], nums[right]);
    }
}
