/* write a menu where the user can choose to perform mathematical equations 
on two numbers in binary or in hexadecimal
*/

import java.util.Scanner;

public class BinaryOrHexMenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // print menu
        final BinaryOrHexMenu menu = new BinaryOrHexMenu();
        menu.printMenu();

        // promt user for menu choice
        System.out.println("Please enter your choice: ");

        // get choice of which base number system to perform mathematics from user
        int choice = input.nextInt();

        switch(choice) {
            case 0: final BinaryOrHexMenu binary = new BinaryOrHexMenu();
            binary.addBinary();
            break;
            case 1: final BinaryOrHexMenu hex = new BinaryOrHexMenu();
            hex.addHex();
            break;
            default: System.out.println("Invalid choice.");
        }

        input.close();

    }

    // function to print menu
    public void printMenu() {
        System.out.println("Welcome!");
        System.out.println("\nWould you like to perform mathematical equations in:\n0\tBinary\n1\tHexadecimal");
    }

    // function for binary numbers
    public void addBinary() {

        Scanner in = new Scanner(System.in);

        // prompt user for first number
        System.out.println("Enter first binary number: ");

        // get number 1 as string
        String binary1 = in.nextLine();

        // promt user for second number
        System.out.println("Enter second binary number: ");

        // get number 2 as string
        String binary2 = in.nextLine();

        // convert number 1 to base 10 integer
        int num1 = Integer.parseInt(binary1, 2);

        // convert number 2 to base 10 integer
        int num2 = Integer.parseInt(binary2, 2);

        // add converted number 1 and converted number 2
        int sum = num1 + num2;
        // subtract converted number1 and converted number 2
        int subtraction = num1 - num2;
        // multiply converted number1 and converted number 2
        int product = num1 * num2;
        // divide converted number1 and converted number 2
        int division = num1 / num2;

        // convert sum to a binary string 
        String binarySum = Integer.toBinaryString(sum);
        // convert subtraction to a binary string 
        String binarySubtraction = Integer.toBinaryString(subtraction);
        // convert product to a binary string 
        String binaryProduct = Integer.toBinaryString(product);
        // convert division to a binary string 
        String binaryDivision = Integer.toBinaryString(division);

        // print sum to screen
        System.out.println("The sum of the two binary numbers is: " + binarySum);
        // print subtraction to screen
        System.out.println("The subtraction of the two binary numbers is: " + binarySubtraction);
        // print product to screen
        System.out.println("The product of the two binary numbers is: " + binaryProduct);
        // print division to screen
        System.out.println("The two binary numbers divided is: " + binaryDivision);

        in.close();
    }

    // function for hexadecimal numbers
    public void addHex() {

        Scanner in = new Scanner(System.in);

        // prompt the user for first number
        System.out.println("Enter first hexadecimal number: ");

        // get  first number as string
        String hex1 = in.nextLine();

        // prompt the user for second number
        System.out.println("Enter second hexadecimal number: ");

        // get second number as string
        String hex2 = in.nextLine();

        // convert first number to base 10 long number
        long num1 = Long.parseLong(hex1, 16);

        // convert second number to base 10 long number
        long num2 = Long.parseLong(hex2, 16);

        // add converted number 1 and converted number 2
        long sum = num1 + num2;
        // subtract converted number 1 and converted number 2
        long subtraction = num1 - num2;
        // multiply converted number 1 and converted number 2
        long product = num1 * num2;
        // divide converted number 1 and converted number 2
        long division = num1 / num2;

        // convert sum to a hexadecimal string
        String hexSum = Long.toHexString(sum);
        // convert subtraction to a hexadecimal string
        String hexSubtraction = Long.toHexString(subtraction);
        // convert product to hexadecimal string
        String hexProduct = Long.toHexString(product);
        // convert division to hexadecimal string
        String hexDivision = Long.toHexString(division);

        // print the sum to screen
        System.out.println("The sum of the two hexadecimal numbers is: " + hexSum);
        // print the subtraction to screen
        System.out.println("The subtraction of the two hexadecimal numbers is: " + hexSubtraction);
        // print product to screen
        System.out.println("The product of the two hexadecimal numbers is: " + hexProduct);
        // print divisiom to screen
        System.out.println("The two hexadecimal numbers divided is: " + hexDivision);

        in.close();
    }
}