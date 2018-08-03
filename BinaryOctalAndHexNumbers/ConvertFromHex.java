// Write a Java program to convert a hexadecimal to a decimal number

import java.util.Scanner;

public class ConvertFromHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for hexadecimal number
        System.out.println("Enter a Hexadecimal Number: ");

        // get hexadecimal number as string
        String hex = input.nextLine();

        // convert hexadecimal string to base 10 integer
        int num = Integer.parseInt(hex, 16);

        // print base 10 integer to screen
        System.out.println("The hexadecimal number " + hex + " in base 10 is: " + num);

        input.close();
    }
}