package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи количество чисел:");
        int digitsCount = scanner.nextInt();
        int[] n = new int[digitsCount];
        int i;
        for (i = 0; i < digitsCount; i++)
        {
            System.out.println("Введи число:");
            n[i] = scanner.nextInt();
        }
        int maxDigit=0;
        for (i=0; i < digitsCount; i++ ){
            int summ = n[i]+n[digitsCount-i-1];
            if(maxDigit < summ){
                maxDigit = summ;
            }
         }

        System.out.println("Max= " + maxDigit);
    }
}
