import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_35Test {

    @Test
    public void searchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(2, new Solution_35().searchInsert(nums, 5));
        assertEquals(1, new Solution_35().searchInsert(nums, 2));
        assertEquals(4, new Solution_35().searchInsert(nums, 7));
        assertEquals(0, new Solution_35().searchInsert(nums, 0));
    }

}