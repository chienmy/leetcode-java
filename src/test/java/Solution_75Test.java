import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution_75Test {

    @Test
    public void sortColors() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] sorted_nums = new int[]{0, 0, 1, 1, 2, 2};
        new Solution_75().sortColors(nums);
        assertArrayEquals(sorted_nums, nums);
    }
}