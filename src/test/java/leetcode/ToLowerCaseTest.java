package leetcode;

import leetcode.ToLowerCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ToLowerCaseTest {

    ToLowerCase toLowerCase;

    @Before
    public void setUp() {
        toLowerCase = new ToLowerCase();
    }

    @Test
    public void toLowerCaseWhenOneElement() {
        String input = "A";
        Assert.assertEquals("a", toLowerCase.toLowerCase(input));
    }
    @Test
    public void setToLowerCase() {
        String input = "AbcDZ";
        Assert.assertEquals("abcdz", toLowerCase.toLowerCase(input));
    }
}