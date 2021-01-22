import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_989Test {

    @Test
    public void addToArrayFormA() {
        assertEquals("1234", getNum(new Solution_989().addToArrayForm(new int[]{1, 2, 0, 0}, 34)));
    }

    @Test
    public void addToArrayFormB() {
        assertEquals("455", getNum(new Solution_989().addToArrayForm(new int[]{2, 7, 4}, 181)));
    }

    @Test
    public void addToArrayFormC() {
        assertEquals("1021", getNum(new Solution_989().addToArrayForm(new int[]{2, 1, 5}, 806)));
    }

    private String getNum(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        for (int i : list) {
            builder.append(i);
        }
        return builder.toString();
    }
}