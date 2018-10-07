package random;

import java.util.Arrays;

public class MagicNumber {

    public boolean canMakeMagicNumber(int[] input, int magicNumber) {

        int sum = Arrays.stream(input).boxed().reduce(0, Integer::sum);
        return (sum >= magicNumber && ((sum - magicNumber) % 2 == 0));
    }
}
