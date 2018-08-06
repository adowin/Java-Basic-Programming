/*Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. 
Also count how many three-digit numbers are there.

Expected Output:

123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is: 24
*/

public class ThreeDigitNum {

    public static void main(String[] args) {

        // create a variable to hold the total number of three digit numbers used
        int amount = 0;

        // write a for loop to iterate through the hundreds place
        for(int i = 1; i <= 4; i++) {
            // write a for loop to iterate through the tens place
            for(int j = 1; j <= 4; j++) {
                // write a for loop to iterate through the ones place
                for(int k = 1; k <= 4; k++) {
                    // write an if statement to insure that each number is unique (no duplicate number within a three digit number)
                    if(k != i && k != j && i != j) {

                        // count three digit numbers used
                        amount++;

                        // print the numbers to the screen
                        System.out.println(i + "" + j + "" + k);

                    }
                }
            }
        }

        // print the total amount of three digit numbers used to the screen
        System.out.println("Total number of the three-digit-number is: " + amount);
    }
}
