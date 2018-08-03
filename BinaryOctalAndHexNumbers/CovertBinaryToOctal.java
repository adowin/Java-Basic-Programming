// Write a Java program to convert a binary number to a Octal number

import java.util.Scanner;

public class CovertBinaryToOctal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for binary number
        System.out.println("Enter a binary number: ");

        // get binary number as string
        String binary = input.nextLine();

        // convert binary string number to base 10 integer
        int num = Integer.parseInt(binary, 2);

        // convert base 10 integer to octal string
        String octal = Integer.toOctalString(num);

        // print octal string to screen
        System.out.println("The binary number " + binary + " in octal is: " + octal);

        input.close();
    }

}