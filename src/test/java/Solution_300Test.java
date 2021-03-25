import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_300Test {

    @Test
    public void lengthOfLISA() {
        assertEquals(4, new Solution_300().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    @Test
    public void lengthOfLISB() {
        assertEquals(4, new Solution_300().lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }

    @Test
    public void lengthOfLISC() {
        assertEquals(1, new Solution_300().lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
}