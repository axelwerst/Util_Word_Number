package com.gmail.axelwerst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class WordUtilsTest {
    @Test
    void testGetShortestWord() {
        // Given
        List<String> words = List.of("apple", "dog", "banana", "cat");

        // When
        String shortestWord = WordUtils.getShortestWord(words);

        // Then
        Assertions.assertEquals("dog", shortestWord);
    }

    @Test
    void testGetShortestWordWithEmptyList() {
        // Given
        List<String> words = List.of();

        // When & Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> WordUtils.getShortestWord(words));
    }

    @Test
    void testGetShortestWordWithNull() {
        // Given
        List<String> words = null;

        // When & Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> WordUtils.getShortestWord(words));
    }
}
