package coursera.unionfind;

public class QuickFindUF {

    private int[] ids;

    public QuickFindUF(int n) {
        ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return ( ids[p] == ids[q]);
    }

    //quadratic time!
    public void union(int p , int q) {
        int pid = ids[p];
        int qid = ids[q];
        for (int i = 0; i < ids.length; i++) {
            if(ids[i] == pid) ids[i] = qid;
        }
    }
}
