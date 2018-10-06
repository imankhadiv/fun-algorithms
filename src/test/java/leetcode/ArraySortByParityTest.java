package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySortByParityTest {

    ArraySortByParity app;

    @Before
    public void setUp() {
        app = new ArraySortByParity();
    }

    @Test
    public void doNotSorttWehnAllNumbersAreEven() {

        int[] input = {2, 4, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, app.sortArrayByParity(input));
    }

    @Test
    public void doNotSorttWehnAllNumbersAreOdd() {

        int[] input = {3, 5, 7};
        int[] expected = {3, 5, 7};
        assertArrayEquals(expected, app.sortArrayByParity(input));

    }

    @Test
    public void sort() {

        int[] input = {1, 3, 2, 4, 6};
        int[] expected = {6, 2, 4, 3, 1};
        assertArrayEquals(expected, app.sortArrayByParity(input));
    }

    @Test
    public void sortByStream() {

        int[] input = {1, 3, 2, 4, 6};
        int[] expected = {2, 4, 6, 1, 3};
        assertArrayEquals(expected, app.sortArrayByParity2(input));
    }

}