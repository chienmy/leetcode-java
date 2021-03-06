import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, visited, list, result);
        return result;
    }

    private void backtrack(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (i != 0 && nums[i] == nums[i-1] && !visited[i-1]) {
                continue;
            }
            list.add(nums[i]);
            visited[i] = true;
            backtrack(nums, visited, list, result);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
