package ru.romantsev.Assigment467;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        Monitor monitor = new Monitor(scanner);
        calculator.setMonitor(monitor);
        calculator.setScanner(scanner);
        calculator.calculate();
    }
}
