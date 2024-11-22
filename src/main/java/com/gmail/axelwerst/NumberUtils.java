package com.gmail.axelwerst;

import java.util.List;

public class NumberUtils {
    public static int getSum(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Список чисел не може бути null");
        }
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
