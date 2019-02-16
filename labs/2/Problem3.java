//Creates three random variables between two integer limits
package lab2;

import java.util.Random;
import java.util.Scanner;

public class Problem3 {

   public static void main(String[] args) {
	   //Create scanner
	   //Create int variables and print text; assign numbers entered to variables
	   int n1,n2;
	   Scanner input = new Scanner(System.in);

	   System.out.println("Enter lower limit integer");
	   n1 = input.nextInt();
	   System.out.println("Enter upper limit integer");
	   n2 = input.nextInt();
	   
	   //
	   for (int i = 0; i < 3; i++) {
           System.out.println(getRand(n1, n2));
           input.close();
	   }
   	   }
   //Created incase n1 >= n2 -- illegal argument. 
   private static int getRand(int n1, int n2) {

       if (n1 >= n2) {
           throw new IllegalArgumentException("Max limit must be greater than the min limit");
       }

       Random r = new Random();
       return r.nextInt((n2 - n1) + 1) + n1;
   }
}