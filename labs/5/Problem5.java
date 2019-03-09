package lab5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		//Creates int variable for size and creates scanner object 
		int size;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		
		//Inputs size values 
		size = input.nextInt();
		
		//Inputs the numbers entered into the matrix
		int matrix[][] = new int[size][size];
		System.out.println("Enter numbers into the matrix row-by-row: ");
		for (int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		//Prints original matrix 
		System.out.println("Original matrix");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		//Prints the transpose of the matrix
		System.out.println("Transpose of the matrix:");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(matrix[j][i]+ " ");
			}
			System.out.println();

		}
		input.close();
	}
}
