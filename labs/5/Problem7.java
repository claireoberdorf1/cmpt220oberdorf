package lab5;

import java.util.Scanner;

public class Problem7 {

	public static void main(String args[]) {
		int size;
		
		//Create scanner input
		Scanner input = new Scanner(System.in);
		
		//Stores the size of the matrix
		System.out.println("Enter the size of the matrix: ");
		size = input.nextInt();
		
		//Creates multidimensional array and stores it
		double[][] array = new double[size][size];
		System.out.println("Enter numbers into the matrix row-by-row: ");
		for (int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				array[i][j] = input.nextInt();
			}
		}
	
        //Calls function of the UpperTrianglar
        if(isUpperTriangular(array)) {
            System.out.println("The array is an upper triangluar matrix");
        } else {
            System.out.println("The array is not an upper triangular matrix.");
        }
        input.close();
    }
	
	//Completes UpperTrianglar function
	private static boolean isUpperTriangular(double[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				if(i >j) {
					if(!(array[i][j] == 0)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
