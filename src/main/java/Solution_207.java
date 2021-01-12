import java.util.ArrayList;
import java.util.List;

public class Solution_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        // 使用邻接表存储图，可以提高效率
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        for (int[] arr : prerequisites) {
            adjacency.get(arr[1]).add(arr[0]);
        }
        // 依次访问每个节点，如果有环则立刻返回false
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, visited, adjacency)) {
                return false;
            }
        }
        // 无环返回true
        return true;
    }

    private boolean dfs(int n, int[] visited, List<List<Integer>> adjacency) {
        // 访问结束前第二次访问到，说明存在环
        if (visited[n] == 1) {
            return false;
        }
        // 已经确定不存在环
        else if (visited[n] == -1) {
            return true;
        } else {
            visited[n] = 1;
            // 对于每个邻接节点，都应用一次dfs
            for (int index : adjacency.get(n)) {
                // 如果有环则立刻返回false
                if (!dfs(index, visited, adjacency)) {
                    return false;
                }
            }
            // 确定不存在环
            visited[n] = -1;
            return true;
        }
    }
}
