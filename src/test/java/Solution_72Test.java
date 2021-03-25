import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_72Test {

    @Test
    public void minDistanceA() {
        assertEquals(3, new Solution_72().minDistance("horse", "ros"));
    }

    @Test
    public void minDistanceB() {
        assertEquals(5, new Solution_72().minDistance("intention", "execution"));
    }
}