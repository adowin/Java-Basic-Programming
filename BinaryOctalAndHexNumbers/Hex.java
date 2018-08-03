// Write a Java program to add two hexadecimal numbers

import java.util.Scanner;

public class Hex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt the user for first number
        System.out.println("Enter first hexadecimal number: ");

        // get  first number as string
        String hex1 = input.nextLine();

        // prompt the user for second number
        System.out.println("Enter second hexadecimal number: ");

        // get second number as string
        String hex2 = input.nextLine();

        // convert first number to base 10 long number
        long num1 = Long.parseLong(hex1, 16);

        // convert second number to base 10 long number
        long num2 = Long.parseLong(hex2, 16);

        // add converted number 1 and converted number 2
        long sum = num1 + num2;
        // subtract converted number 1 and converted number 2
        long subtraction = num1 - num2;
        // multiply converted number 1 and converted number 2
        long product = num1 * num2;
        // divide converted number 1 and converted number 2
        long division = num1 / num2;

        // convert sum to a hexadecimal string
        String hexSum = Long.toHexString(sum);
        // convert subtraction to a hexadecimal string
        String hexSubtraction = Long.toHexString(subtraction);
        // convert product to hexadecimal string
        String hexProduct = Long.toHexString(product);
        // convert division to hexadecimal string
        String hexDivision = Long.toHexString(division);

        // print the sum to screen
        System.out.println("The sum of the two hexadecimal numbers is: " + hexSum);
        // print the subtraction to screen
        System.out.println("The subtraction of the two hexadecimal numbers is: " + hexSubtraction);
        // print product to screen
        System.out.println("The product of the two hexadecimal numbers is: " + hexProduct);
        // print divisiom to screen
        System.out.println("The two hexadecimal numbers divided is: " + hexDivision);

        input.close();
    }
}