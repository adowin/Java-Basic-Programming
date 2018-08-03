// Write a Java program that takes five numbers as input to calculate and print the average of the numbers

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter your first number: ");

        int num1 = input.nextInt();

        System.out.println("Enter your second number: ");

        int num2 = input.nextInt();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number: ");

        int num4 = input.nextInt();

        System.out.println("Enter your fifth number: ");

        int num5 = input.nextInt();


        int average = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("The average of the five numbers is: " + average);

        input.close();
    }
}