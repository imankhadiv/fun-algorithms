package coursera.unionfind;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickFindUFTest {

    QuickFindUF quickFindUF;

    @Before
    public void setUp() {
        quickFindUF = new QuickFindUF(100);
    }

    @Test
    public void shouldNotBeConnectedBeforeUnion() {
        int p = 10;
        int q = 20;
        Assert.assertFalse(quickFindUF.connected(p, q));
    }

    @Test
    public void shouldBeConnectedAfterUnion() {
        int p = 10;
        int q = 20;
        quickFindUF.union(p, q);
        Assert.assertTrue(quickFindUF.connected(p, q));
    }

    @Test
    public void union() {

        Assert.assertFalse(quickFindUF.connected(10, 30));
        quickFindUF.union(10, 20);
        quickFindUF.union(20, 30);
        Assert.assertTrue(quickFindUF.connected(10, 30));
    }
}