package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        numberPrint();
    }

    public static void numberPrint() {
        for (int i = 1; i <= 50; i++) {
            int num = i;
            if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if ((num % 3 == 0 && num % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(num);
            }
        }

    }
}