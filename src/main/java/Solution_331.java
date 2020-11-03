public class Solution_331 {
    public boolean isValidSerialization(String preorder) {
        int slot = 1;
        for (String s : preorder.split(",")) {
            slot --;
            if (slot < 0) return false;
            if (! "#".equals(s)) {
                slot += 2;
            }
        }
        return slot == 0;
    }
}
