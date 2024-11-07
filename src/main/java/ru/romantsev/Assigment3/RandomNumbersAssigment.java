package ru.romantsev.Assigment3;

import java.util.Random;

public class RandomNumbersAssigment {
    public static void main(String[] args) {
        int[] randomNumbers = new int[20];
        Random random = new Random();
        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = random.nextInt(11+10)-10;
        }

        int smallestPositive = Integer.MAX_VALUE;
        int biggestNegative = Integer.MIN_VALUE;
        int smallPosition = 0;
        int bigPosition = 0;

        //до перемены max min
        for(int number : randomNumbers){
            System.out.print(number + " ");
        }

        for(int i = 0, j = 0; i < randomNumbers.length; i++,j++){
                if(smallestPositive > randomNumbers[i] && randomNumbers[i] > 0){
                    smallestPositive=randomNumbers[i];
                    smallPosition = i;}
                if(biggestNegative < randomNumbers[j] && randomNumbers[j] < 0){
                    biggestNegative=randomNumbers[j];
                    bigPosition = j;}
        }
        int temp = randomNumbers[smallPosition]; //в темп лежит позитивка
        randomNumbers[smallPosition] = randomNumbers[bigPosition];
        randomNumbers[bigPosition] = temp;

        System.out.println();
        //после перемены max min
        for(int number : randomNumbers){
            System.out.print(number + " ");
        }
    }
}
