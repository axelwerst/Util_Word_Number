package com.gmail.axelwerst;


import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "cat", "banana", "pear");
        String shortestWord = WordUtils.getShortestWord(words);
        System.out.println("Найкоротше слово: " + shortestWord);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = NumberUtils.getSum(numbers);
        System.out.println("Сума чисел: " + sum);
    }
}