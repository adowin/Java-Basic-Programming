/* Write a Java program to compute the area of a polygon

Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side

Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6

Expected Output:
The area is: 130.82084798405722
*/

import java.util.Scanner;

public class AreaOfPolygon {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for the number of sides on the polygon
        System.out.println("Input the number of sides on the polygon: ");

        // get number of sides on polygon as integer
        int numSides = input.nextInt();

        // prompt user for length of one of the sides
        System.out.println("Input the length of one of the sides: ");

        // get length of one of the sides as double
        double side = input.nextDouble();

        // print area of polygon to screen
        System.out.println("The area is: " + polygonArea(numSides, side));

        input.close();
    }

    // create a function to calculate the area of the polygon
    public static double polygonArea(int numSides, double side) {
        return (numSides * (side * side)) / (4 * Math.tan(Math.PI / numSides));
    }
}