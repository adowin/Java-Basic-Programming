// Write a Java program that takes two numbers as input and display the product of two numbers

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        // create a Scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user for first number
        System.out.println("Enter your first number: ");

        int num1 = input.nextInt();

        // prompt user for second number
        System.out.println("Enter your second number: ");

        int num2 = input.nextInt();

        // create a variable that holds the product of the two numbers
        int product = num1 * num2;

        // print equation to screen
        System.out.println(num1 + " " + "x " + num2 + " = " + product);

        input.close();
    }

}