/**Class: RandomArrayValue
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: October 2, 2023
 *
 * This class – This program creates an array of 50 random double values, then
 * prompts the user to enter an index thats between 0 and 49. Then uses a try catch, to
 * prevents the program from terminating if an out of range index is entered by the user.
 */

import java.util.Scanner;
import java.util.Random;

public class RandomArrayValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        double[] doubleArray = new double[50];

        for(int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = random.nextDouble();
        }

     while (true){
         try {
             System.out.println("Enter an index between 0 and 49:  ");
             int index = input.nextInt();
             double value = doubleArray[index];


             System.out.println("The value at index " + index + " is: " + value);

         } catch (ArrayIndexOutOfBoundsException e){
             System.err.println("Invalid input, try again!");
         }
     }
    }
}
