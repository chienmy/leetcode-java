import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> answer = new ArrayList();
        List<List<Integer>> result = new ArrayList();
        // 先排序
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, answer, result);
        return result;
    }

    // candidates 输入集合
    // pos 当前标记位置，标记前的元素不再考虑
    // target 求和目标
    // answer 临时解法
    // result 最终结果
    private void backtrack(int[] candidates, int pos, int target, List<Integer> answer, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(answer));
        }
        for (int i = pos; i < candidates.length; i++) {
            // 剪枝：后续元素都比目标大，直接break（比continue要快）
            if (candidates[i] > target) {
                break;
            }
            // 添加元素
            answer.add(candidates[i]);
            // 元素可以重复取，所以从当前位置继续
            backtrack(candidates, i, target - candidates[i], answer, result);
            // 移除元素
            answer.remove(answer.size() - 1);
        }
    }
}
