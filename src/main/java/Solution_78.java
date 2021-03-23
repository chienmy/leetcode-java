import java.util.ArrayList;
import java.util.List;

public class Solution_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subSet = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, subSet, result);
        return result;
    }

    private void backtrack(int[] nums, int pos, List<Integer> subSet, List<List<Integer>> result) {
        result.add(new ArrayList<>(subSet));
        for (int i = pos; i < nums.length; i++) {
            subSet.add(nums[i]);
            backtrack(nums, i+1, subSet, result);
            subSet.remove(subSet.size() - 1);
        }
    }
}
