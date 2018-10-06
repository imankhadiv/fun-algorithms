package coursera.unionfind;

public class WeightedQuickUnion {

    private int[] ids;
    private int[] sz;

    public WeightedQuickUnion(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
            sz[i] = 0;
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
        if (rootP == rootQ) return;
        if (sz[rootP] < sz[rootQ]) {
            ids[rootP] = rootQ;
            sz[rootQ] += sz[rootP];
        } else {
            ids[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        }
    }
}
