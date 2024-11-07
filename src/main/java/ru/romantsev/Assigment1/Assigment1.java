package ru.romantsev.Assigment1;

import java.util.Scanner;

/**
 * @author Nikita Romantsev
 * @see #addition(float, float) takes two float numbers and adds them together with result having 4 digits after the decimal point
 * */
public class Assigment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstNumber;
        float secondNumber;
        System.out.println("Программа сложения дробных чисел.\nВведите первое число:");
        firstNumber = scanner.nextFloat();
        System.out.println("Введите второе число:");
        secondNumber = scanner.nextFloat();
        System.out.printf("Результат: %.4f", addition(firstNumber, secondNumber));
    }

    public static float addition(float first, float second){
        return first + second;
    }
}
