import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_455Test {

    @Test
    public void findContentChildrenA() {
        assertEquals(1, new Solution_455().findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }

    @Test
    public void findContentChildrenB() {
        assertEquals(2, new Solution_455().findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}