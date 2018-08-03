// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Math {

    public static void main(String[] args) {

        // create a Scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for first number
        System.out.println("Enter your first number: ");

        int num1 = input.nextInt();

        // prompt user for second number
        System.out.println("Enter your second number: ");

        int num2 = input.nextInt();

        // create variables to hold the values for each equation
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;
        int mod = num1 % num2;

        // print the eqations to the screen
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " X " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " mod " + num2 + " = " + mod);

        input.close();
    }
}