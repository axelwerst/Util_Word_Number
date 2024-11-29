package com.gmail.axelwerst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordUtils {
    public static String getShortestWord(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("Список слів не може бути порожнім або null");
        }
        return words.stream()
                .min((a, b) -> Integer.compare(a.length(), b.length()))
                .orElseThrow(() -> new IllegalStateException("Не вдалося знайти найкоротше слово"));
    }

    public static Map<String, Integer> countWordOccurrences(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return new HashMap<>();
        }

        String[] words = sentence.toLowerCase().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", ""); // Видаляємо знаки пунктуації
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

}
