package coursera.unionfind;

public class QuickUnionFind {

    private int[] ids;

    public QuickUnionFind(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public int root(int i) {
        while (i != ids[i]) {
            i = ids[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    public void union(int p, int q) {
            int rootP = root(p);
            int rootQ = root(q);
            ids[rootP] = rootQ;
    }

}
