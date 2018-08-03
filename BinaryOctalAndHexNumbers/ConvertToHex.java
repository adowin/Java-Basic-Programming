// Write a Java program to convert a decimal number to hexadecimal number

import java.util.Scanner;

public class ConvertToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for base 10 number
        System.out.println("Input a Base 10 Number: ");

        // get number as base 10 long number
        long num = input.nextLong();

        // convert base 10 long number to hexadecimal string
        String hex = Long.toHexString(num);

        // print hexadecimal string to screen
        System.out.println("Base 10 number " + num + " in hexadecimal is: " + hex);

        input.close();
    }

}