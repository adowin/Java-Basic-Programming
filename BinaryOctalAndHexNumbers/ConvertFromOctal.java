// Write a Java program to convert a octal number to a decimal number

import java.util.Scanner;

public class ConvertFromOctal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for Octal number
        System.out.println("Enter an Octal Number: ");

        // get octal number as string
        String octal = input.nextLine();

        // convert octal number to base 10 integer
        int num = Integer.parseInt(octal, 8);

        // print base 10 integer to screen
        System.out.println("The octal number " + octal + " in Base 10 is: " + num);

        input.close();
    }

}