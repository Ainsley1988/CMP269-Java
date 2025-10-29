package other;
 /* Class notes 09/02/2025 




 */

import java.util.Scanner;



public class DoWHileExample2 {


    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        String input;

        do{
            System.out.print("Enter a text:");
            input = scan.next();// .next only takes one word so if you enter two word  then  it will consider it another input

        }while(!input.equalsIgnoreCase("end"));

        System.out.println("You selected to continue");
        scan.close();

    } 

    
}