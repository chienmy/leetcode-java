import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_1584 {
    public int minCostConnectPoints(int[][] points) {
        class Edge {
            int from;
            int to;
            int cost;

            Edge(int from, int to, int cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }
        }
        int[] visited = new int[points.length];
        int pos = 0;
        int result = 0;
        Queue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.cost));
        do {
            visited[pos] = 1;
            for (int i = 0; i < points.length; i++) {
                if (visited[i] == 0) {
                    int cost = Math.abs(points[i][0] - points[pos][0]) + Math.abs(points[i][1] - points[pos][1]);
                    pq.offer(new Edge(pos, i, cost));
                }
            }
            while (!pq.isEmpty()) {
                Edge e = pq.poll();
                if (visited[e.from] + visited[e.to] == 1) {
                    pos = visited[e.to] == 1 ? e.from : e.to;
                    result += e.cost;
                    break;
                }
            }
        } while (!pq.isEmpty());
        return result;
    }
}
