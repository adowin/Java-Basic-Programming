// Write a Java program to swap two variables.

import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {

        int temp;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x: ");

        int x = input.nextInt();

        System.out.println("Enter y: ");

        int y = input.nextInt();

        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

        temp = x;

        x = y;

        y = temp;

        System.out.println("After swapping\nx = " + x + "\ny = " + y);

        input.close();
    }
}