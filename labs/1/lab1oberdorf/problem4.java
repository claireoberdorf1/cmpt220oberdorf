package lab1;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Created mass variable 
	    System.out.println("Enter mass: ");
	    double m = input.nextDouble();
	    
	    //Created speed variable 
	    System.out.println("Enter speed: ");
	    double c = input.nextDouble();
	    
	    //Generated equation and output
	    double E = m * c * c;
	    System.out.println("Energy = "+ E);
	}

}
