public class Solution_205 {

    public boolean isIsomorphic(String s, String t) {
        char[] sToT = new char[256];
        char[] tToS = new char[256];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (sToT[s.charAt(i)] != 0 || tToS[t.charAt(i)] != 0) {
                if (!(sToT[s.charAt(i)] == t.charAt(i) && tToS[t.charAt(i)] == s.charAt(i))) {
                    return false;
                }
            } else {
                sToT[s.charAt(i)] = t.charAt(i);
                tToS[t.charAt(i)] = s.charAt(i);
            }
        }
        return true;
    }

    /*
    // 简单方法：使用Map保存映射关系
    public boolean judge(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i))) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    */
}
