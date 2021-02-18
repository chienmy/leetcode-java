import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_995Test {

    @Test
    public void minKBitFlips() {
        assertEquals(3, new Solution_995().minKBitFlips(new int[]{0,0,0,1,0,1,1,0}, 3));
    }
}