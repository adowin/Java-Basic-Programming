// Write a Java program to convert a decimal number to octal number

import java.util.Scanner;

public class ConvertToOctal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for base 10 number
        System.out.println("Input a Base 10 Number: ");

        // get number as base 10 integer
        int num = input.nextInt();

        // convert base 10 integer to octal string
        String octal = Integer.toOctalString(num);

        // print octal string to screen
        System.out.println("Base 10 number " + num + " in octal is: " + octal);

        input.close();
    }

}