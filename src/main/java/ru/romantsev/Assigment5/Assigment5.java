package ru.romantsev.Assigment5;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assigment5 {
    public static void main(String[] args) {
        ClassLoader classLoader = Assigment5.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("wordsFile.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String words;
        try {
            words = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] wordsList = words.split("\\s");

        //сортировка по алфавиту
        Arrays.stream(wordsList).sorted().forEach(s -> System.out.println(s));

        //красивый пробел
        System.out.println();

        //мапим по количеству повторений
        Map<String, Long> wordFrequencyMap = Arrays.stream(wordsList)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        wordFrequencyMap.forEach((s, aLong) -> System.out.printf("Слово %s встречается %d раз(а)\n", s, aLong));

        //находим самое часто встречающееся
        long max = Collections.max(wordFrequencyMap.values());
        List<String> maxWords = wordFrequencyMap
                .entrySet()
                .stream()
                .filter(e -> e.getValue().longValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("\nСлова по частоте повторения: ");
        maxWords.forEach(s -> System.out.printf("Слово %s встречается %d раз(а)\n", s, max));
    }
}
