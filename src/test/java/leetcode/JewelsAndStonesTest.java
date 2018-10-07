package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JewelsAndStonesTest {

    JewelsAndStones app;

    @Before
    public void setUp() {
        app = new JewelsAndStones();
    }

    @Test
    public void whenThereIsNotJewels() {
        String input = "A";
        Assert.assertEquals(0, app.numJewelsInStones("", "abc"));
    }

    @Test
    public void setToLowerCase() {

        Assert.assertEquals(3, app.numJewelsInStones("aA", "aAAbbbb"));
    }

}