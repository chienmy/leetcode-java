import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int d = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int num = K % 10;
            K = (K - num) / 10;
            int sumNum = (A[i] + num + d) % 10;
            d = (A[i] + num + d) / 10;
            result.add(sumNum);
        }
        while (K > 0) {
            int num = K % 10;
            K = (K - num) / 10;
            int sumNum = (num + d) % 10;
            d = (num + d) / 10;
            result.add(sumNum);
        }
        if (d > 0) {
            result.add(d);
        }
        Collections.reverse(result);
        return result;
    }
}
