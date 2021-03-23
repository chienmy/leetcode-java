import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> subSet = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, subSet, result);
        return result;
    }

    private void backtrack(int[] nums, int pos, List<Integer> subSet, List<List<Integer>> result) {
        result.add(new ArrayList<>(subSet));
        for (int i = pos; i < nums.length; i++) {
            if (i != pos && nums[i] == nums[i-1]) {
                continue;
            }
            subSet.add(nums[i]);
            backtrack(nums, i+1, subSet, result);
            subSet.remove(subSet.size() - 1);
        }
    }
}
