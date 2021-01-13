public class Solution_684 {
    private int[] parent;
    private int[] size;

    private int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    public boolean union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return true;
        }
        if (size[pRoot] < size[qRoot]) {
            parent[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        } else {
            parent[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }
        return false;
    }

    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length + 1];
        size = new int[edges.length + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for (int[] arr : edges) {
            if (union(arr[0], arr[1])) {
                return arr;
            }
        }
        return new int[]{};
    }
}
