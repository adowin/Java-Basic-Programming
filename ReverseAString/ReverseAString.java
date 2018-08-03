/* Write a Java program to reverse a string.

Input Data:
Input a string: The quick brown fox 

Expected Output
Reverse string: xof nworb kciuq ehT

*/

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for a line of text
        System.out.println("Input a string: ");

        // take line of text as a character array
        char[] letters = input.nextLine().toCharArray();

        // reverse the string and print the reversed string to screen
        System.out.println("Reverse string: ");

        for(int i = letters.length -1; i >= 0; i--) {
            System.out.print(letters[i]);
        }

        System.out.println("\n");

        input.close();
    }
}