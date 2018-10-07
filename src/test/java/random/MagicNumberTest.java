package random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagicNumberTest {

    MagicNumber app;

    @Before
    public void setUp() throws Exception {
        app = new MagicNumber();
    }

    @Test
    public void canMakeMagicNumber() {
        int[] input = {1, 2, 3};
        int magicNumber = 0;
        Assert.assertTrue(app.canMakeMagicNumber(input, magicNumber));
    }

    @Test
    public void canNotMakeMagicNumber() {
        int[] input = {1, 3, 3};
        int magicNumber = 0;
        Assert.assertFalse(app.canMakeMagicNumber(input, magicNumber));
    }

    @Test
    public void canMakeMagicNumberWhenMagicNumberIsOdd() {
        int[] input = {5, 5, 5};
        int magicNumber = 5;
        Assert.assertTrue(app.canMakeMagicNumber(input, magicNumber));
    }

    @Test
    public void canNotMakeMagicNumberWhenMagicNumberIsOdd() {
        int[] input = {5, 10, 5};
        int magicNumber = 5;
        Assert.assertFalse(app.canMakeMagicNumber(input, magicNumber));
    }

    @Test
    public void canNotMakeMagicNumberWhenMagicNumberWhenSumIsLessThanMagicNumber() {
        int[] input = {1, 2, 1};
        int magicNumber = 5;
        Assert.assertFalse(app.canMakeMagicNumber(input, magicNumber));
    }
}