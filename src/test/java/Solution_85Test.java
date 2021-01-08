import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_85Test {

    @Test
    public void maximalRectangleA() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        assertEquals(6, new Solution_85().maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangleB() {
        char[][] matrix = new char[][]{};
        assertEquals(0, new Solution_85().maximalRectangle(matrix));
    }

    @Test
    public void maximalRectangleC() {
        char[][] matrix = new char[][]{{'0'}};
        assertEquals(0, new Solution_85().maximalRectangle(matrix));
    }
}