package com.epam.javauniversity.utils.occurenceword;

import java.util.HashMap;
import java.util.Map;

public final class OccurrenceWord {
    private OccurrenceWord() {

    }

    public static Map<String, Integer> getFrequencyWord(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("");
        }
        Map<String, Integer> occurrenceWord = new HashMap<String, Integer>();
        String[] words = text.toLowerCase().split("\\s+|\\s*,\\s*|\\s*\\.\\s*");
        for (String word: words) {
            if (occurrenceWord.containsKey(word)) {
                occurrenceWord.put(word, occurrenceWord.get(word) + 1);
            } else {
                occurrenceWord.put(word, 1);
            }
        }
        return occurrenceWord;
    }
}