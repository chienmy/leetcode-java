import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_803Test {

    @Test
    public void hitBricks() {
        int[][] bricks = {
                {1,0,0,0},
                {1,1,1,0}
        };
        int[][] hits = {{1,0}};
        assertArrayEquals(new int[]{2}, new Solution_803().hitBricks(bricks, hits));
    }

    @Test
    public void hitBricksB() {
        int[][] bricks = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
        };
        int[][] hits = {{0,2},{2,0},{0,1},{1,2}};
        assertArrayEquals(new int[]{0,0,1,0}, new Solution_803().hitBricks(bricks, hits));
    }
}