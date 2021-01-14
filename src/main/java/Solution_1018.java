import java.util.LinkedList;
import java.util.List;

public class Solution_1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new LinkedList<>();
        int q = 0;
        for (int n : A) {
            q = (2 * q + n) % 5;
            result.add(q == 0);
        }
        return result;
    }
}
