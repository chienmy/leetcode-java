public class Solution_135 {
    public int candy(int[] ratings) {
        int[] num = new int[ratings.length];
        num[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] < ratings[i - 1]) {
                if (num[i - 1] > 1) {
                    num[i] = 1;
                } else {
                    num[i] = 1;
                    for (int j = i; j > 0 && ratings[j - 1] > ratings[j] && num[j - 1] <= num[j] ; j--) {
                        num[j - 1] = num[j] + 1;
                    }
                }
            } else if (ratings[i] == ratings[i - 1]) {
                num[i] = 1;
            } else {
                num[i] = num[i - 1] + 1;
            }
        }
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
}
