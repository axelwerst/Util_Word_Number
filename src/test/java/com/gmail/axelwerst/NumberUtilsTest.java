package com.gmail.axelwerst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberUtilsTest {
    @Test
    void testGetSum() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // When
        int sum = NumberUtils.getSum(numbers);

        // Then
        Assertions.assertEquals(15, sum);
    }

    @Test
    void testGetSumWithEmptyList() {
        // Given
        List<Integer> numbers = List.of();

        // When
        int sum = NumberUtils.getSum(numbers);

        // Then
        Assertions.assertEquals(0, sum);
    }

    @Test
    void testGetSumWithNull() {
        // Given
        List<Integer> numbers = null;

        // When & Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> NumberUtils.getSum(numbers));
    }
}
