package ru.romantsev.Assigment2;

import java.sql.Array;
import java.util.Scanner;

public class Assigment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldBreak = false;
        while (true) {
            System.out.println("\nДобрый день! Наберите цифру для выбора программы:\n" +
                    "1 - Калькулятор\n" +
                    "2 - Поиск самого длинного слова из списка\n" +
                    "3 - завершить работу программы");
            int input = scanner.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("\nВыберите операцию:\n" +
                            "1 Сложение\n" +
                            "2 Вычитание\n" +
                            "3 Умножение\n" +
                            "4 Деление\n" +
                            "5 Вернуться в начало программы");
                    int calculatorInput = scanner.nextInt();
                    switch (calculatorInput) {
                        case 1: {
                            System.out.println("\nВведите первое число:");
                            float firstNumber = scanner.nextFloat();
                            System.out.println("Введите второе число:");
                            float secondNumber = scanner.nextFloat();
                            System.out.printf("Результат: %.4f", addition(firstNumber, secondNumber));
                            break;
                        }
                        case 2: {
                            System.out.println("\nВведите первое число:");
                            float firstNumber = scanner.nextFloat();
                            System.out.println("Введите второе число:");
                            float secondNumber = scanner.nextFloat();
                            System.out.printf("Результат: %.4f", substraction(firstNumber, secondNumber));
                            break;
                        }
                        case 3: {
                            System.out.println("\nВведите первое число:");
                            float firstNumber = scanner.nextFloat();
                            System.out.println("Введите второе число:");
                            float secondNumber = scanner.nextFloat();
                            System.out.printf("Результат: %.4f", multiplication(firstNumber, secondNumber));
                            break;
                        }
                        case 4: {
                            System.out.println("\nВведите первое число:");
                            float firstNumber = scanner.nextFloat();
                            System.out.println("Введите второе число:");
                            float secondNumber = scanner.nextFloat();
                            System.out.printf("Результат: %.4f", division(firstNumber, secondNumber));
                            break;
                        }
                        case 5: {
                            break;
                        }
                        default:
                            System.out.println("Введите корректный символ");
                            break;
                    } break;
                }
                case 2: {
                    System.out.println("\nВведите длину списка слов");
                    int arrayLength = scanner.nextInt();
                    String[] wordsArray = new String[arrayLength];
                    int position = 0;
                    int maxLength = 0;
                    for(int i = 0; i < arrayLength; i++){
                        System.out.println("Введите слово");
                        String newWord = scanner.next();
                        wordsArray[i] = newWord;
                        if(newWord.length() > maxLength){
                            maxLength = newWord.length();
                            position = i;
                        }
                    }
                    System.out.printf("Самое длинное слово в списке: %s\n", wordsArray[position]);
                    break;
                }
                case 3: {
                    System.out.println("Завершаю работу");
                    shouldBreak = true;
                    break;
                }
                default:
                    System.out.println("Введите корректный символ");
                    break;
            }
            if(shouldBreak) break;
        }
    }
        public static float addition ( float first, float second){
            return first + second;
        }
        public static float substraction ( float first, float second){
            return first - second;
        }
        public static float multiplication ( float first, float second){
            return first * second;
        }
        public static float division ( float first, float second){
            if (second == 0) {
                System.out.println("Делить на ноль нельзя");
                return 0;
            }
            return first / second;
        }

}
