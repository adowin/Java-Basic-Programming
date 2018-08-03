// Write a Java program to convert a octal number to a binary number

import java.util.Scanner;

public class OctalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for octal number
        System.out.println("Enter an Octal Number: ");

        // get octal number as string
        String octal = input.nextLine();

        // conver octal string to base 10 integer
        int num = Integer.parseInt(octal, 8);

        // convert base 10 integer to binary string
        String binary = Integer.toBinaryString(num);

        // print binary string to screen
        System.out.println("The octal number " + octal + " in binary is: " + binary);

        input.close();
    }
}