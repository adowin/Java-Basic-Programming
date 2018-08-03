// Write a Java program to print the area and perimeter of a circle where the user inputs the radius

import java.util.Scanner;

public class CircleUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        double radius = input.nextDouble();

        System.out.println("Perimeter is: " + (2 * Math.PI * radius));
        System.out.println("Area is: " + (Math.PI * radius * radius));

        input.close();
    }
}
