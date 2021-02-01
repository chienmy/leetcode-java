import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1Test {

    @Test
    public void twoSum() {
        int[] arr = new Solution_1().twoSum(new int[]{2, 7, 11, 15}, 9);
        int min = Math.min(arr[0], arr[1]);
        int max = Math.max(arr[0], arr[1]);
        assertEquals(0, min);
        assertEquals(1, max);
    }

    @Test
    public void twoSumB() {
        int[] arr = new Solution_1().twoSum(new int[]{3, 2, 4}, 6);
        int min = Math.min(arr[0], arr[1]);
        int max = Math.max(arr[0], arr[1]);
        assertEquals(1, min);
        assertEquals(2, max);
    }
}