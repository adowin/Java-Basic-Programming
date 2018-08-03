/* Write a Java program to compare two numbers

Example:
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39

*/

import java.util.Scanner;

public class CompareTwoNumbers {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for first number
        System.out.println("Enter first number: ");

        // get first number as integer
        int num1 = input.nextInt();

        // prompt user for second number
        System.out.println("Enter second number: ");

        // get second number as intege
        int num2 = input.nextInt();

        // write if else statments to compare the numbers
        if(num1 != num2) {
            System.out.println(num1 + " != " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }

        if(num1 < num2) {
            System.out.println(num1 + " < " + num2); 
        } else {
            System.out.println(num1 + " > " + num2);
        }

        if(num1 <= num2) {
            System.out.println(num1 + " <= " + num2);
        } else {
            System.out.println(num1 + " >= " + num2);
        }

        input.close();
     }
}