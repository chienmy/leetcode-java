public class Solution_1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[45];
        int sum = 0;
        for (int[] pair : dominoes) {
            int i = Math.min(pair[0], pair[1]);
            int j = Math.max(pair[0], pair[1]);
            int index = (20 - i) * (i - 1) / 2 + (j - i);
            sum += count[index];
            count[index]++;
        }
        return sum;
    }
}
