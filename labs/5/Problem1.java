package lab5;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		
		//Creating the array
		double[] array = new double[10];
		double maxnumber;
		
		//Prints text to ask users for 10 numbers
		System.out.println("Enter 10 numbers: ");
		
		for(int i=0; i<10; i++){
			array[i] = input.nextDouble();
		}
		
		//Calls method and stores return value
		maxnumber = max(array);
		System.out.println("The largest number is "+ maxnumber);

		input.close();
	}

	//Function to find maximum output
	public static double max(double[] array) {
		double maximum = array[0];
		
		for(int i=1; i<10; i++){
			if(array[i] > maximum){
				 maximum = array[i];
			}
		}
		 
		//Returns maximum output
		return maximum;
	}
}
