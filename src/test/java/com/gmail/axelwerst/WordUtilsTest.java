package com.gmail.axelwerst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordUtilsTest {
    @Test
    void testGetShortestWord() {
        // Given
        List<String> words = List.of("apple", "dog", "banana", "cat");

        // When
        String shortestWord = WordUtils.getShortestWord(words);

        // Then
        assertEquals("dog", shortestWord);
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
    @Test
    public void testCountWordOccurrences() {
        String sentence = "Hello world! Hello again, world.";
        Map<String, Integer> result = WordUtils.countWordOccurrences(sentence);
        assertEquals(2, result.get("hello"));
        assertEquals(2, result.get("world"));
        assertEquals(1, result.get("again"));
    }

    @Test
    public void testEmptySentence() {
        String sentence = "";
        Map<String, Integer> result = WordUtils.countWordOccurrences(sentence);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testNullSentence() {
        Map<String, Integer> result = WordUtils.countWordOccurrences(null);
        assertTrue(result.isEmpty());
    }
}
