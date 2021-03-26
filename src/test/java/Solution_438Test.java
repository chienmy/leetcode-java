import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution_438Test {

    @Test
    public void findAnagramsA() {
        List<Integer> result = new Solution_438().findAnagrams("cbaebabacd", "abc");
        assertEquals(0, result.get(0).intValue());
        assertEquals(6, result.get(1).intValue());
    }

    @Test
    public void findAnagramsB() {
        List<Integer> result = new Solution_438().findAnagrams("abab", "ab");
        assertEquals(0, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
        assertEquals(2, result.get(2).intValue());
    }
}