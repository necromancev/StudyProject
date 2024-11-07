package ru.romantsev.Assigment467;

import java.util.Scanner;

public class Monitor {
    private Scanner scanner;
    private float firstNumber;
    private float secondNumber;

    public Monitor(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setNumbers(){
        System.out.println("\nВведите первое число:");
        firstNumber = scanner.nextFloat();
        System.out.println("Введите второе число:");
        secondNumber = scanner.nextFloat();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }

}
