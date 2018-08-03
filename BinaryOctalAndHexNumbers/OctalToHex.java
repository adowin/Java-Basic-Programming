// Write a Java program to convert a octal number to a hexadecimal number

import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt the user for an octal number
        System.out.println("Enter an Octal Number: ");

        // get octal number as string
        String octal = input.nextLine();

        // convert octal number to base 10 integer
        int num = Integer.parseInt(octal, 8);

        // convert base 10 integer to hexadecimal string
        String hex = Integer.toHexString(num);

        // print hexadecimal string to screen
        System.out.println("The octal number " + octal + " in hexadecimal is: " + hex);

        input.close();
    }
}