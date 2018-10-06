package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MorseCode {

    String[] morseCodes = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {

        int count = 0;
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (set.add(findMorseCode(word))) count++;
        }
        return count;

    }

    private String findMorseCode(String word) {
        StringBuilder morseCode = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            morseCode.append(morseCodes[word.charAt(i) - 'a']);
        }
        return morseCode.toString();
    }
}
