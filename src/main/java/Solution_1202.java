import java.util.*;
import java.util.stream.Collectors;

public class Solution_1202 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        StringBuilder builder = new StringBuilder(s);
        boolean[] visited = new boolean[pairs.size()];
        List<Set<Integer>> result = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) {
            if (!visited[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(pairs.get(i).get(0));
                Set<Integer> set = new HashSet<>();
                while (!queue.isEmpty()) {
                    int e = queue.poll();
                    set.add(e);
                    for (int j = 0; j < pairs.size(); j++) {
                        if (!visited[j]) {
                            if (pairs.get(j).get(0) == e) {
                                queue.offer(pairs.get(i).get(1));
                                visited[j] = true;
                            } else if (pairs.get(j).get(1) == e) {
                                queue.offer(pairs.get(i).get(0));
                                visited[j] = true;
                            }
                        }
                    }
                }
                visited[i] = true;
                result.add(set);
            }
        }
        for (Set<Integer> set : result) {
            List<Character> list = set.stream().sorted().map(s::charAt).sorted().collect(Collectors.toList());
            Iterator<Character> iterator = list.iterator();
            set.stream().sorted().forEach(i -> {
                builder.replace(i, i + 1, "" + iterator.next());
            });
        }
        return builder.toString();
    }
}
