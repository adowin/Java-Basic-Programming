/* Write a Java program to compute the area of a hexagon

Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side

Input Data:
Input the length of a side of the hexagon: 6

Expected Output:
The area of the hexagon is: 93.53074360871938

*/

import java.util.Scanner;

public class AreaOfHexagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for lengthe of a side of the hexagon
        System.out.println("Enter length of one side of a hexagon: ");

        // get length as a double
        double side = input.nextDouble();

        // print the area to the screen
        System.out.println("The area of the hexagon is: " + hexagonArea(side));

        input.close();
    }

    // write a function that calculates the area of a hexagon
    public static double hexagonArea(double side) {
        return (6 * (side * side)) / (4 * Math.tan(Math.PI/6));
    }
}