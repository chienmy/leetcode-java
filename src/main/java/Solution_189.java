public class Solution_189 {
    public void rotate(int[] nums, int k) {
        int[] results = new int[nums.length];
        k %= nums.length;
        System.arraycopy(nums, nums.length - k, results, 0, k);
        System.arraycopy(nums, 0, results, k, nums.length - k);
        System.arraycopy(results, 0, nums, 0, nums.length);
    }
}
