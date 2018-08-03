/* Write a Java program to print a face. 

Expected Output:

 +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+

 */

 public class Face {
     public static void main(String[] args) {

        //System.out.println(" +\"\"\"\"\"+ ");
        //System.out.println("[| o o |]");
        //System.out.println(" |  ^  |");
        //System.out.println(" | '-' |");
        //System.out.println(" +-----+");

        String[] faceArray = new String[5];

        faceArray[0] = " +\"\"\"\"\"+ ";
        faceArray[1]= "[| o o |]";
        faceArray[2]= " |  ^  |";
        faceArray[3]= " | '-' |";
        faceArray[4]= " +-----+";

        for(int i = 0; i < 5; i++) {
            System.out.println(faceArray[i]);
        }
     }
 }