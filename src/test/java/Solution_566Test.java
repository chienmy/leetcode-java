import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_566Test {

    @Test
    public void matrixReshape() {
        int[][] nums = {{1, 2}, {3, 4}};
        assertArrayEquals(new int[]{1, 2, 3, 4}, new Solution_566().matrixReshape(nums, 1, 4)[0]);
    }
}