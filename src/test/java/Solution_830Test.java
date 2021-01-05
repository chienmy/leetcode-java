import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_830Test {

    @Test
    public void largeGroupPositionsA() {
        List<List<Integer>> excepted = Collections.singletonList(Arrays.asList(3, 6));
        assertEquals(excepted, new Solution_830().largeGroupPositions("abbxxxxzzy"));
    }

    @Test
    public void largeGroupPositionsB() {
        assertEquals(0, new Solution_830().largeGroupPositions("abc").size());
    }

    @Test
    public void largeGroupPositionsC() {
        List<List<Integer>> excepted = Arrays.asList(Arrays.asList(3, 5), Arrays.asList(6, 9), Arrays.asList(12, 14));
        assertEquals(excepted, new Solution_830().largeGroupPositions("abcdddeeeeaabbbcd"));
    }
}