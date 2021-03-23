public class Solution_215 {
    public int findKthLargest(int[] nums, int k) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            // 对标志两边分别进行处理
            int pivot = partition(nums, l, r);
            // 标志就是k
            if (pivot == nums.length - k) {
                break;
            }
            // k位置在标志的右侧
            else if (pivot < nums.length - k) {
                l = pivot + 1;
            }
            // k位置在标志的左侧
            else {
                r = pivot - 1;
            }
        }
        return nums[nums.length - k];
    }

    private int partition(int[] nums, int start, int end) {
        int l = start;
        int r = end + 1;
        // 选择首元素作为比较标志
        // 比标志小的放在左边，比标志大的放在右边
        while (true) {
            while (nums[++l] < nums[start] && l < end);
            while (nums[--r] > nums[start] && r > start);
            if (l >= r) {
                break;
            }
            swap(nums, l, r);
        }
        // 将标志交换到中间
        swap(nums, start, r);
        return r;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
