// Write a Java program to print the area and perimeter of a rectangle where the user inputs the width and height of rectangle

import java.util.Scanner;

public class RectangleUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width of the rectangel: ");

        double width = input.nextDouble();

        System.out.println("Enter the height of the rectangel: ");

        double height = input.nextDouble();

        System.out.println("The perimeter is: " + (2 * (width + height)));

        System.out.println("The area is: " + (width * height));

        input.close();
    }
}