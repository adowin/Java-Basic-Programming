/* Write a Java program to prompt the user to enter two numbers
then divide those two numbers and print to the screen.
*/

import java.util.Scanner;

public class DivideUserInput {

    public static void main(String[] args) {

        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user for the first number
        System.out.println("Enter your first number: ");

        int num1 = input.nextInt();

        // prompt the user for the second number
        System.out.println("Enter your second number: ");

        int num2 = input.nextInt();

        // variable that holds the value of the two divided numbers
        int value = num1 / num2;

        // print the value to the screen
        System.out.println(num1 + " " + "/ " + num2 + " " + "= " + value);

        input.close();

    }
}