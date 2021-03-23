public class Solution_75 {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] < 1) {
                swap(nums, left, mid);
                mid++;
                left++;
            } else if (nums[mid] > 1) {
                swap(nums, right, mid);
                right--;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
