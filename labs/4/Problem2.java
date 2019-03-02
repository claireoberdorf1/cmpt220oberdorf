package lab4;

import java.util.Random;

public class Problem2 {

	public static void main(String[] args) {
		//Creates char array of 5*5 matrix
		char matrix[][] = new char[5][5]; 
		
		//Creates random object
		Random random = new Random(); 
		
		//Loops 5*5 times
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				
				//Creates char of lower case characters
				char c = (char)(random.nextInt(26)+'a'); 
				
				//Stores matrix 
				matrix[i][j] = c; 
		
				//Prints matrix in console
				System.out.print(matrix[i][j]+" "); 
		
		}
			
		//New line for each row
		System.out.print("\n");
			 
		}
		  
	}
}
