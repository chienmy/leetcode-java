import java.util.*;

public class Solution_399 {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // 使用Map保存除数与被除数之间的对应关系和值
        Map<String, Map<String, Double>> map = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String Ai = equations.get(i).get(0);
            String Bi = equations.get(i).get(1);
            map.putIfAbsent(Ai, new HashMap<>());
            map.putIfAbsent(Bi, new HashMap<>());
            map.get(Ai).putIfAbsent(Bi, values[i]);
            map.get(Bi).putIfAbsent(Ai, 1.0 / values[i]);
        }
        // 结果数组
        double[] result = new double[queries.size()];
        // 对每个queries做出处理
        for (int i = 0; i < queries.size(); i++) {
            result[i] = -1;
            String Ci = queries.get(i).get(0);
            String Di = queries.get(i).get(1);
            // 构建队列
            Queue<List<String>> queue = new LinkedList<>();
            List<String> firstElement = new ArrayList<>();
            firstElement.add(Ci);
            queue.offer(firstElement);
            // 使用广度优先搜索的方法
            while (!queue.isEmpty()) {
                List<String> element = queue.poll();
                Ci = element.get(element.size() - 1);
                // 包含才继续处理
                if (map.containsKey(Ci)) {
                    // 对于Ci对应的每个值
                    for (String s : map.get(Ci).keySet()) {
                        // 找到到达Di的路径
                        if (Di.equals(s)) {
                            element.add(s);
                            // 计算结果值并退出
                            result[i] = 1.0;
                            for (int j = 0; j < element.size() - 1; j++) {
                                result[i] *= map.get(element.get(j)).get(element.get(j + 1));
                            }
                            break;
                        }
                        // 否则将Di加入list作为新的可能路径加入队列
                        else {
                            // 检验一下list内是否已经包含，如果包含说明循环了，则不可达
                            if (!element.contains(s)) {
                                List<String> newElement = new ArrayList<>(element);
                                newElement.add(s);
                                queue.offer(newElement);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

}
