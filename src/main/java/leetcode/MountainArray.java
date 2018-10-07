package leetcode;

public class MountainArray {

    public int linearPeakIndexInMountainArray(int[] A) {
        int i = 0;
        while (A[i] < A[i + 1]) i++;
        return i;
    }

    public int logarithmicPeakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }

    public int highestPeakIndexInMountainArray(int[] A) {
        int index = 0, pick = 0;
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] < A[i + 1] && A[i + 1] > A[i + 2] && pick < A[i + 1]) {
                index = i + 1;
                pick = A[i + 1];
            }
        }
        return index;
    }
}
