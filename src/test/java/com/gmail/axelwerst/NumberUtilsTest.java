package com.gmail.axelwerst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberUtilsTest {
    @Test
    void testGetSum() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // When
        int sum = NumberUtils.getSum(numbers);

        // Then
        assertEquals(15, sum);
    }

    @Test
    void testGetSumWithEmptyList() {
        // Given
        List<Integer> numbers = List.of();

        // When
        int sum = NumberUtils.getSum(numbers);

        // Then
        assertEquals(0, sum);
    }

    @Test
    void testGetSumWithNull() {
        // Given
        List<Integer> numbers = null;

        // When & Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> NumberUtils.getSum(numbers));
    }
    @Test
    public void testMultiplyOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);
        assertEquals(Arrays.asList(2, 2, 6, 4, 10), result);
    }

    @Test
    public void testEmptyList() {
        List<Integer> numbers = Arrays.asList();
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testNullList() {
        List<Integer> result = NumberUtils.multiplyOddNumbers(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testAllEvenNumbers() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);
        assertEquals(Arrays.asList(2, 4, 6, 8), result);
    }

    @Test
    public void testAllOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, 5);
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);
        assertEquals(Arrays.asList(2, 6, 10), result);
    }

}
