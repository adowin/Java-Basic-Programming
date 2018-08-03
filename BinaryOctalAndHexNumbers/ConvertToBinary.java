// Write a Java program to convert a decimal number to binary number

import java.util.Scanner;

public class ConvertToBinary {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // prompt user for number
        System.out.println("Input a Base 10 Number: ");

        // get number as base 10 integer
        int num = input.nextInt();

        // convert base 10 integer to binary string
        String binary = Integer.toBinaryString(num);

        // print binary string to screen
        System.out.println("Base 10 number " + num + " in binary is: " + binary);

        input.close();
    }
}