package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortByParity {

    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int startNumber = A[start];
            int endNumber = A[end];
            while (start != end && startNumber % 2 == 0) {
                startNumber = A[++start];
            }
            while (end != start && endNumber % 2 == 1) {
                endNumber = A[--end];
            }
            if (start == end) return A;
            A[start++] = endNumber;
            A[end--] = startNumber;
        }
        return A;
    }

    //nlogn
    public int[] sortArrayByParity2(int[] A) {

        return Arrays.stream(A).boxed().sorted(Comparator.comparingInt(a -> a % 2)).
                mapToInt(i -> i).toArray();
    }
}