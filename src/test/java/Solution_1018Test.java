import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_1018Test {
    @Test
    public void prefixesDivBy5A() {
        assertResult(Arrays.asList(true, false, false), new Solution_1018().prefixesDivBy5(new int[]{0, 1, 1}));
    }

    @Test
    public void prefixesDivBy5B() {
        assertResult(Arrays.asList(false, false, false), new Solution_1018().prefixesDivBy5(new int[]{1, 1, 1}));
    }

    @Test
    public void prefixesDivBy5C() {
        assertResult(Arrays.asList(true, false, false, false, true, false), new Solution_1018().prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1}));
    }

    private void assertResult(List<Boolean> excepted, List<Boolean> actual) {
        assert excepted.size() == actual.size();
        for (int i = 0; i < excepted.size(); i++) {
            assertEquals(excepted.get(i), actual.get(i));
        }
    }
}