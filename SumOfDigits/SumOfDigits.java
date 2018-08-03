/* Write a Java program that computes the sum of the digits of an integer

Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
*/

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for number
        System.out.println("Enter an integer: ");

        // get number as integer 
        String line = input.nextLine();

        // print the sum of the digits of the integer to the screen
        System.out.println("The sum of the digits is: " + sumDigits(line));

        input.close();
    }

    // write a function to compute the sum of the digits of an integer
    public static int sumDigits(String line) {
        int sum = 0;
        for(int i = 0; i < line.length(); i++) {

            Character charNum = line.charAt(i);

            int num = Integer.parseInt(charNum.toString());
            sum += num;
        }

        return sum;
    }
}