// Write a Java program to convert a binary number to decimal number

import java.util.Scanner;

public class ConvertFromBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for binary number
        System.out.println("Enter a binary number: ");

        // get binary number as string
        String binary = input.nextLine();

        // convert binary string number to base 10 integer
        int num = Integer.parseInt(binary, 2);

        // print base 10 integer to screen
        System.out.println("Binary number " + binary + " in base 10 is: " + num);

        input.close();
    }
}