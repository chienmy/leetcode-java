import java.util.Arrays;

public class Solution_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p = 0;
        int q = 0;
        while (p < g.length && q < s.length) {
            if (g[p] <= s[q]) {
                p++;
            }
            q++;
        }
        return p;
    }
}
