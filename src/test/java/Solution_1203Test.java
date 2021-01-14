import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution_1203Test {

    @Test
    public void sortItems() {
        List<List<Integer>> beforeItems = new ArrayList<>();
        //[],[6],[5],[6],[3,6],[],[],[]
        for (int[] arr : new int[][]{{}, {6}, {5}, {6}, {3, 6}, {}, {}, {}}) {
            List<Integer> item = new ArrayList<>();
            for (int i : arr) {
                item.add(i);
            }
            beforeItems.add(item);
        }
        new Solution_1203().sortItems(8, 2, new int[]{-1, -1, 1, 0, 0, 1, 0, -1}, beforeItems);
    }
}