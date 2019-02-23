package lab3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		//Creates variables
		int counter = 0;
	    double even = 0;
	    double sum = 0;
	    int number = 0;
	    double average;
	    
	    //Prints text for user to enter numbers
	    System.out.print("Enter a positive interger, the input ends with a 0: ");
	    Scanner input = new Scanner(System.in);

	    //Determines the evens and sums
	    while ((number = input.nextInt()) != 0) {

	        if (number != 0)
	            sum = number + sum;
	            counter++;

	        if (number % 2 == 0)
	            even = even + 1;
	       
	       }

	    if (counter > 0) {
	    	
	    	//Calculates the average
	        average = sum / counter;

	        //Prints text for calculated data
	        System.out.println("The number of even numbers: " + even);
	        System.out.println("The total sum: " + sum);
	        System.out.println("The average is: " + average);
	        
	        input.close();
	    
	    } 

	    }
	}


