package leetcode;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {

        int count = 0;
        for (char ch : S.toCharArray()) {
            if (J.indexOf(ch) != -1) count++;
        }
        return count;
    }
}
