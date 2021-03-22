import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_74Test {

    @Test
    public void searchMatrix() {
        int[][] matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        assertTrue(new Solution_74().searchMatrix(matrix, 3));
        assertFalse(new Solution_74().searchMatrix(matrix, 13));
    }
}