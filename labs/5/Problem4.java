package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		//Creates scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first array \n (Begin array 1 with the number of elements in array): ");
		
		//Stores array1 size and elements
		int length1 = input.nextInt();
		int[]array1 = new int[length1];
		for(int i=0; i<length1; i++) {
			array1[i] = input.nextInt();
		}
		
		System.out.print("Enter the second array \n (Begin array 2 with the number of elements in array): ");
		
		//Stores array2 size and elements
		int length2 = input.nextInt();
		int[]array2 = new int[length2];
		for(int i=0; i<length2; i++) {
			array2[i] = input.nextInt();
		}
		
		//Calls function to see of array 1 and array 2 are identical, if, else
		if(equal(array1, array2)) {
			System.out.println("The two arrays are identical.");
		}
		else {
			System.out.println("The two arrays are not identical.");
		}
		input.close();
	}
	
	// Function that sorts arrays and sees if elements are identical 
	public static boolean equal(int [] array1, int [] array2){
        if(array1.length!=array2.length){
        	return false;
	    }
	      
	    Arrays.sort(array1);
	    Arrays.sort(array2);
        for(int i=0;i<array1.length;i++){
        	if(array1[i]!=array2[i]){
        		return false;
	        }
	    }
	        return true;
	}
}
