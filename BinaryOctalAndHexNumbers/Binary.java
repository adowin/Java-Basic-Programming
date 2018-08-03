// Write a Java program to add two binary numbers

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for first number
        System.out.println("Enter first binary number: ");

        // get number 1 as string
        String binary1 = input.nextLine();

        // promt user for second number
        System.out.println("Enter second binary number: ");

        // get number 2 as string
        String binary2 = input.nextLine();

        // convert number 1 to base 10 integer
        int num1 = Integer.parseInt(binary1, 2);

        // convert number 2 to base 10 integer
        int num2 = Integer.parseInt(binary2, 2);

        // add converted number 1 and converted number 2
        int sum = num1 + num2;
        // subtract converted number1 and converted number 2
        int subtraction = num1 - num2;
        // multiply converted number1 and converted number 2
        int product = num1 * num2;
        // divide converted number1 and converted number 2
        int division = num1 / num2;

        // convert sum to a binary string 
        String binarySum = Integer.toBinaryString(sum);
        // convert subtraction to a binary string 
        String binarySubtraction = Integer.toBinaryString(subtraction);
        // convert product to a binary string 
        String binaryProduct = Integer.toBinaryString(product);
        // convert division to a binary string 
        String binaryDivision = Integer.toBinaryString(division);

        // print sum to screen
        System.out.println("The sum of the two binary numbers is: " + binarySum);
        // print subtraction to screen
        System.out.println("The subtraction of the two binary numbers is: " + binarySubtraction);
        // print product to screen
        System.out.println("The product of the two binary numbers is: " + binaryProduct);
        // print division to screen
        System.out.println("The two binary numbers divided is: " + binaryDivision);

        input.close();
    }
}