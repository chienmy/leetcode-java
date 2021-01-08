import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_189Test {

    @Test
    public void rotateA() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] results = new int[]{5, 6, 7, 1, 2, 3, 4};
        new Solution_189().rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], results[i]);
        }
    }

    @Test
    public void rotateB() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int[] results = new int[]{3, 99, -1, -100};
        new Solution_189().rotate(nums, 2);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(nums[i], results[i]);
        }
    }
}