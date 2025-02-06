package Homework.Lesson3i2;

import java.util.Scanner;

public class Multiplication {
    public void multiplication(int number) {
        int x = 1;
        int result;
        do {
            result = x * number;
            System.out.println("5 x " + x + " = " + result);
            x++;
        } while (x < 11);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        Multiplication multiplication = new Multiplication();
        multiplication.multiplication(number);
    }

}
