package lab5;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		//Creates scanner object and double variables 
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		double sddeviation;
		double mean;
		
		//Asks user for 10 numbers and puts them into array
		System.out.println("Enter 10 numbers: ");
		for(int i=0; i<10; i++) {
			array[i] = input.nextDouble();
		}
		
		//Standard deviation function on array
		sddeviation = deviation(array);
		//Mean function on array
		mean = mean(array);
		
		System.out.println("The mean is: " + mean);
		System.out.println("The standard deviation is: " + sddeviation);
		input.close();
	}

	//Calculates the mean
	private static double mean(double[] array) {
		double sum =0;
		double average;
		for(int i=0; i<10; i++) {
			sum += array[i];
		}
		
		average = sum/10;
		return average;
	}

	//Calculates the standard deviation 
	private static double deviation(double[] array) {
		double sum = 0;
		double summ = 0;
		double average;
		double result; 
		for(int i=0; i<10; i++) {
			sum += array[i];
		}
		
		average = sum/10;
		for(int i=0; i<10; i++) {
			summ+= Math.pow((array[i]-average), 2);
		}
		
		result = summ/9;
		result = Math.sqrt(result);
		return result;
	}
}