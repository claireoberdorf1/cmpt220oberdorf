//Compares strings lexicographically
package lab2;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
	   //Creates scanner and prints text to enter strings
	   //Creates strings
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter string 1 here:");
	   String str1 = input.nextLine();
	   System.out.println("Enter string 2 here:");
	   String str2 = input.nextLine();
	   
	   //Creates result variable by comparing strings lexicographically, less than, equal too, greater than
	   int result = str1.compareTo(str2);
	   if (result < 0) {
		   System.out.println("\"" + str1 + "\"" + " is less than " + "\"" + str2 + "\"");
	   }
	   else if (result == 0) {
		   System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
	   }
	   else {
		   System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" + str2 + "\"");  
		   input.close();
	   }
	}
}
		