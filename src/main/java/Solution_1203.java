import java.util.ArrayList;
import java.util.List;

public class Solution_1203 {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        int[] visitedItem = new int[n];
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacency.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < beforeItems.get(i).size(); j++) {
                adjacency.get(j).add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!dfs(i, visitedItem, adjacency)) {
                return new int[]{};
            }
        }
        int groupIndex = m;
        for (int i = 0; i < group.length; i++) {
            if (group[i] == -1) {
                group[i] = groupIndex;
                groupIndex++;
            }
        }
        int[] visitedGroup = new int[groupIndex];
        List<List<Integer>> groupAdjacency = new ArrayList<>();
        for (int i = 0; i < groupIndex; i++) {
            groupAdjacency.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < beforeItems.get(i).size(); j++) {
                if (group[i] != group[j]) {
                    groupAdjacency.get(group[j]).add(group[i]);
                }
            }
        }
        return null;
    }


    private boolean dfs(int n, int[] visited, List<List<Integer>> adjacency) {
        if (visited[n] == 1) {
            return false;
        } else if (visited[n] == -1) {
            return true;
        } else {
            visited[n] = 1;
            for (int index : adjacency.get(n)) {
                // 如果有环则立刻返回false
                if (!dfs(index, visited, adjacency)) {
                    return false;
                }
            }
            visited[n] = -1;
            return true;
        }
    }
}
