import java.util.LinkedList;
import java.util.Queue;

public class Solution_547 {

    public int findCircleNum(int[][] isConnected) {
        int num = 0;
        // 使用数组存储节点是否被访问过的记录，全部初始化为false
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        // 遍历每个未被访问的节点
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i]) {
                continue;
            }
            // DFS
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            while (!queue.isEmpty()) {
                int fromCity = queue.poll();
                for (int j = 0; j < isConnected.length; j++) {
                    // 与未被访问过的节点相连，入队并标记为已访问过
                    if (!visited[j] && isConnected[fromCity][j] == 1) {
                        queue.offer(j);
                        visited[j] = true;
                    }
                }
            }
            num++;
        }
        return num;
    }

}
