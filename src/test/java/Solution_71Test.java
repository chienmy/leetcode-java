import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_71Test {
    @Test
    public void simplifyPathA() {
        assertEquals("/home", new Solution_71().simplifyPath("/home/"));
    }


    @Test
    public void simplifyPathB() {
        assertEquals("/", new Solution_71().simplifyPath("/../"));
    }

    @Test
    public void simplifyPathC() {
        assertEquals("/home/foo", new Solution_71().simplifyPath("/home//foo"));
    }

    @Test
    public void simplifyPathD() {
        assertEquals("/c", new Solution_71().simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void simplifyPathE() {
        assertEquals("/c", new Solution_71().simplifyPath("/a/../../b/../c//.//"));
    }

    @Test
    public void simplifyPathF() {
        assertEquals("/a/b/c", new Solution_71().simplifyPath("/a//b////c/d//././/.."));
    }
}