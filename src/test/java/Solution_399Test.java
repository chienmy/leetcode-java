import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Solution_399Test {

    private List<List<String>> buildList(String s) {
        return Arrays.stream(s.split(","))
                .map(s1 -> Arrays.stream(s1.split(" ")).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    @Test
    public void calcEquationA() {
        List<List<String>> equations = buildList("a b,b c");
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = buildList("a c,b a,a e,a a,x x");
        double[] actual = new double[]{6.0, 0.5, -1.0, 1.0, -1.0};
        double[] result = new Solution_399().calcEquation(equations, values, queries);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(actual[i], result[i], 0.00001);
        }
    }

    @Test
    public void calcEquationB() {
        List<List<String>> equations = buildList("a b,b c,bc cd");
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = buildList("a c,c b,bc cd,cd bc");
        double[] actual = new double[]{3.75, 0.4, 5.0, 0.2};
        double[] result = new Solution_399().calcEquation(equations, values, queries);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(actual[i], result[i], 0.00001);
        }
    }
}