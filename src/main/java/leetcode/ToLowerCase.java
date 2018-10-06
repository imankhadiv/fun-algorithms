package leetcode;

public class ToLowerCase {

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('A' - chars[i] <= 0) chars[i] = Character.toLowerCase(chars[i]);
        }
        return new String(chars);
    }
}
