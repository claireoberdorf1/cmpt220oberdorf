package lab1;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		// Created variable for ounces
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for ounces: ");
		double ounces = input.nextDouble();
		
		//Grams; conversion 
		double grams = ounces * 28.3495;
		System.out.println(ounces + " ounces is " + grams);
	}
}

	
