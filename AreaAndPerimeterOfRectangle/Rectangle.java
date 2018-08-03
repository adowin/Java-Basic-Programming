/* Write a Java program to print the area and perimeter of a rectangle

Test Data:
Width = 5.5 Height = 8.5

*/

public class Rectangle {

    private static final double width = 5.5;
    private static final double height = 8.5;

    public static void main(String[] args) {

        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);

    }
}