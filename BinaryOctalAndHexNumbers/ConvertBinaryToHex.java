// Write a Java program to convert a binary number to hexadecimal number

import java.util.Scanner;

public class ConvertBinaryToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for binary number
        System.out.println("Enter a binary number: ");

        // get binary number as string
        String binary = input.nextLine();

        // convert binary string number to base 10 long number
        long num = Long.parseLong(binary, 2);

        // convert base 10 long number to hexadecimal string
        String hex = Long.toHexString(num);

        // print hexadecimal string to screen
        System.out.println("Binary number " + binary + " in hexadecimal is: " + hex);

        input.close();
    }
}