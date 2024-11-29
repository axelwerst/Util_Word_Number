package com.gmail.axelwerst;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "cat", "banana", "pear");
        String shortestWord = WordUtils.getShortestWord(words);
        System.out.println("Найкоротше слово: " + shortestWord);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = NumberUtils.getSum(numbers);
        System.out.println("Сума чисел: " + sum);

        String sentence = "Hello world! Hello again, world. Welcome to the world of Java.";
        Map<String, Integer> wordOccurrences = WordUtils.countWordOccurrences(sentence);

        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> modifiedNumbers = NumberUtils.multiplyOddNumbers(numbers);

        System.out.println("Original list: " + numbers1);
        System.out.println("Modified list (odd numbers multiplied by 2): " + modifiedNumbers);
    }

}