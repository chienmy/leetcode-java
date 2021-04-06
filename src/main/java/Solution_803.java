public class Solution_803 {

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int h = grid.length;
        int w = grid[0].length;
        int[] result = new int[hits.length];
        int[][] status = new int[h][w];
        DisJoinSet disJoinSet = new DisJoinSet(h * w + 1);
        // 将status初始化为最终的状态
        for (int i = 0; i < h; i++) {
            status[i] = grid[i].clone();
        }
        for (int[] pos : hits) {
            status[pos[0]][pos[1]] = 0;
        }
        // 根据最后的状态构造并查集
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (status[0][j] == 0) {
                    continue;
                }
                if (i == 0) {
                    disJoinSet.merge( h * w, j);
                } else {
                    if (status[i - 1][j] == 1) {
                        disJoinSet.merge((i - 1) * w + j, i * w + j);
                    }
                    if (j > 0 && status[i][j - 1] == 1) {
                        disJoinSet.merge(i * w + j - 1, i * w + j);
                    }
                }
            }
        }
        // 从后向前把砖块补上
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int i = hits.length - 1; i >= 0; i--) {
            int r = hits[i][0];
            int c = hits[i][1];
            if (grid[r][c] == 0) {
                result[i] = 0;
            } else {
                int prev = disJoinSet.getSize(h * w);
                if (r == 0) {
                    disJoinSet.merge(c, h * w);
                }
                for (int[] direction : directions) {
                    int nr = r + direction[0];
                    int nc = c + direction[1];

                    if (nr >= 0 && nr < h && nc >= 0 && nc < w && status[nr][nc] == 1) {
                        disJoinSet.merge(r * w + c, nr * w + nc);
                    }
                }
                result[i] = Math.max(0, disJoinSet.getSize(h * w) - prev - 1);
                status[r][c] = 1;
            }
        }
        return result;
    }

    static class DisJoinSet {

        private final int[] parent;
        private final int[] size;

        public DisJoinSet(int len) {
            parent = new int[len];
            size = new int[len];
            for (int i = 0; i < len; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void merge(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);
            // 在合并前判断是否属于相同的连通分量
            if (pRoot != qRoot) {
                if (size[pRoot] < size[qRoot]) {
                    parent[pRoot] = qRoot;
                    size[qRoot] += size[pRoot];
                } else {
                    parent[qRoot] = pRoot;
                    size[pRoot] += size[qRoot];
                }
            }
        }

        public int getSize(int n) {
            int root = find(n);
            return size[root];
        }

    }

}
