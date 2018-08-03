// Write a Java program that takes a number as input and prints its multiplication table up to 10

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // create a Scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user for a number
        System.out.println("Enter a number: ");

        int num = input.nextInt();

        // write a for loop to print num's multiplication table up to 10
        for(int i = 0; i<10; i++) {
            System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
        }
       
        input.close();
    }
}