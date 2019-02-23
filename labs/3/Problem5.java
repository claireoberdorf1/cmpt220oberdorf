package lab3;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		//Creates scanner
		Scanner input = new Scanner(System.in);
		
		//Prints the text for user to type in first number
		System.out.print("Input the first number:");
		double a = input.nextDouble();
		
		//Prints the text for user to type in second number
		System.out.print("Input the second number:");
		double b = input.nextDouble();
		
		//Prints the text for user to type in third number
		System.out.print("Input the third number:");
		double c = input.nextDouble();
		
		//Prints the text for the average calculation
		System.out.print("The average of the numbers are " + average(a, b, c) + " ");
		input.close();
}
	public static double average(double a, double b, double c) {
		//Returns the average
		return (a + b + c)/3;
	}
	
}