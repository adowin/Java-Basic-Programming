/* Write a Java program that prompts the user for thier first and last name and then 
 to print 'Hello' on screen and then print the user's first and last name on a separate line.
*/

import java.util.Scanner;

public class HelloUserInput {

    public static void main(String[] args) {

        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user for their first name
        System.out.println("Enter your first name: ");

        String fName = input.next();

        // prompt the user for their last name
        System.out.println("Enter your last name: ");

        String lName = input.next();

        // print Hello on one line and the user's first and last name on another
        System.out.println("Hello \n" + fName + " " + lName + "!");

        input.close();
    }
}