package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Enter numerator ");
                    int numerator = scanner.nextInt();

                System.out.println("Enter Denominator ");
                    int denominator = scanner.nextInt();

                double result = (numerator / denominator);
                System.out.println("Result is " + result);

            }catch (ArithmeticException x){
                System.out.println("You cannot divide by zero");
            }
        }


    }
}