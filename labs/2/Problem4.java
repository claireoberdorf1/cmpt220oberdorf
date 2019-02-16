//Finds the sum of two characters
package lab2;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// Created scanner
		Scanner input = new Scanner(System.in);
		
		// Created int variables
		int c1, c2;
		
		// Prints text to enter characters
		System.out.print("Enter first character: ");
		c1 = input.next().charAt(0); 
		System.out.print("Enter second character: ");
		c2 = input.next().charAt(0);
		
		// Creates result variable and then prints result
		int result = c1 + c2;
		System.out.println("Result is: " + result );
		input.close();
	}

}