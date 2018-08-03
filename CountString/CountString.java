/* Write a Java program to count the letters, spaces, numbers and other characters of an input string. 

Expected Output:

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33

letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6

*/

import java.util.Scanner;

public class CountString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user for a line of text
        System.out.println("The string is: ");

        // get user input as string
        String line = input.nextLine();

        // call the count function to print to screen the total of each count
        count(line);

        input.close();

    }

     // write a function that counts the letters, spaces, numbers, and other characters of the string
     // and prints the total to of each count to the screen
     public static void count(String line) {

        char[] ch = line.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for(int i = 0; i < line.length(); i++){
            if(Character.isLetter(ch[i])) {
                letter++;
            }
            else if(Character.isSpaceChar(ch[i])) {
                space++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else{
                other++;
            }
        }

        System.out.println("The string is: " + line);
        System.out.println("Letter: " + letter);
        System.out.println("Space: " + space);
        System.out.println("Number: " + num);
        System.out.println("Other: " + other);
     }
}