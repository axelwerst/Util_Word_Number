package com.gmail.axelwerst;

import java.util.List;

public class WordUtils {
    public static String getShortestWord(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("Список слів не може бути порожнім або null");
        }
        return words.stream()
                .min((a, b) -> Integer.compare(a.length(), b.length()))
                .orElseThrow(() -> new IllegalStateException("Не вдалося знайти найкоротше слово"));
    }
}
