import java.util.*;
import java.util.stream.Collectors;

public class Solution_721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 1; i < accounts.size(); i++) {
            String name = "Name_" + accounts.get(i).get(0) + "_" + i;
            map.putIfAbsent(name, new ArrayList<>());
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                map.putIfAbsent(email, new ArrayList<>());
                map.get(name).add(email);
                map.get(email).add(name);
            }
        }
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < accounts.size(); i++) {
            String name = "Name_" + accounts.get(i).get(0) + "_" + i;
            if (!visited.contains(name)) {
                List<String> account = new ArrayList<>();
                dfs(map, name, visited, account);
                account = account.stream().sorted().collect(Collectors.toList());
                account.add(0, accounts.get(i).get(0));
                result.add(account);
            }
        }
        return result;
    }

    private void dfs(Map<String, List<String>> edges, String s, Set<String> visited, List<String> account) {
        if (visited.contains(s)) {
            return;
        }
        visited.add(s);
        if (!s.startsWith("Name_")) {
            account.add(s);
        }
        for (String next : edges.get(s)) {
            dfs(edges, next, visited, account);
        }
    }
}
