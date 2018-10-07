package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MountainArrayTest {

    MountainArray app;

    @Before
    public void setUp() {
        app = new MountainArray();
    }

    @Test
    public void linearPeakIndexInMountainArray() {
        int[] input = {0, 2, 3, 2, 0, 5, 0};
        Assert.assertEquals(2, app.linearPeakIndexInMountainArray(input));
    }

    @Test
    public void logarithmicPeakIndexInMountainArray() {
        int[] input = {0, 2, 3, 2, 0, 5, 0};
        Assert.assertEquals(2, app.logarithmicPeakIndexInMountainArray(input));

    }

    @Test
    public void highestPeakIndexInMountainArray() {
        int[] input = {0, 2, 3, 2, 0, 5, 0};
        Assert.assertEquals(5, app.highestPeakIndexInMountainArray(input));

    }
}