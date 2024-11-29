package com.gmail.axelwerst;

import java.util.ArrayList;
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

    public static List<Integer> multiplyOddNumbers(List<Integer> numbers) {
        if (numbers == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(number * 2); // Множимо непарне число на 2
            } else {
                result.add(number); // Парні залишаємо без змін
            }
        }
        return result;
    }
}
