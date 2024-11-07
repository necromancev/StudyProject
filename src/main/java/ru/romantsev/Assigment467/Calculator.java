package ru.romantsev.Assigment467;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private Operation operation;
    private Scanner scanner;
    private Monitor monitor;
    private float firstNumber;
    private float secondNumber;

    public void calculate() {

        loop:
        while (true) {
            try {
                System.out.println("\nДобрый день! Выберите операцию:\n" +
                        "1 Сложение\n" +
                        "2 Вычитание\n" +
                        "3 Умножение\n" +
                        "4 Деление\n" +
                        "5 Завершить работу программы");
                int input = scanner.nextInt();
                switch (input) {
                    case 1: {
                        this.operation = new Addition();
                        break;
                    }
                    case 2: {
                        this.operation = new Substraction();
                        break;
                    }
                    case 3: {
                        this.operation = new Multiplication();
                        break;
                    }
                    case 4: {
                        this.operation = new Division();
                        break;
                    }
                    case 5: {
                        break loop;
                    }
                    default:
                        System.out.println("Введите корректный символ");
                        break;
                }
                monitor.setNumbers();
                firstNumber = monitor.getFirstNumber();
                secondNumber = monitor.getSecondNumber();
                printResults(firstNumber, secondNumber);
            } catch (DividingByZeroException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Введен некорректный символ");
                break loop;
            }
        }
    }

    public float printResults(float firstNumber, float secondNumber) {
        float result = operation.operate(firstNumber, secondNumber);
        System.out.printf("Результат: %.4f\n", result);
        return result;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
