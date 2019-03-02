package lab4;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		
		//Creates scanner object and int variables
		Scanner sc = new Scanner(System.in);
		int n = 0, input;
		int seq[] = new int[100]; //array

		//Prints text asking user to enter positive numbers (no more than 100) ending the input with a 0
		System.out.println("Enter positive numbers and 0 to end: ");

		//Reads first number; less than 100 positive numbers
		input = sc.nextInt();

		while(input != 0 && n<100){
			//Creates array for numbers
			seq[n] = input; 
			n++; 

		//Reads next number
		input = sc.nextInt();
		}

		//Sorts numbers
		for (int i=1; i<n; ++i){
			int current = seq[i]; 
			int j = i-1;

		//Inserts numbers in correct sequence
		while (j>=0 && seq[j] > current){
			seq[j+1] = seq[j];
			j = j-1;
		}

		seq[j+1] = current; 
		}

		//Prints numbers in correct sequence from smallest to largest
		System.out.print("Sorted numbers: ");
		for(int i=0; i<n; i++)
			System.out.print(seq[i] + " ");
			System.out.println();

		//Closes scanner
		sc.close();

	}
}