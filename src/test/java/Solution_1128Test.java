import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1128Test {

    @Test
    public void numEquivDominoPairs() {
        assertEquals(1, new Solution_1128().numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
    }
}