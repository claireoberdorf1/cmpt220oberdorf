package lab4;

import java.text.DecimalFormat;

public class Problem1 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("000.00"); 
		//Prints header for columns and line underneath 
		System.out.print("\n in  cm   |  cm  in");
		System.out.print("\n---------------------");
		
		//Creates for loop for 1-50 inputs for inches and centimeters 
		for(int i=1,j=1;i<=50;){
			
			//Prints inches to centimeters conversion
			System.out.printf("\n%2d ",i);
			System.out.print(df.format(i*2.54));
		
			//Prints centimeters to inches conversion
			System.out.printf(" |%3d ",j);
			System.out.print(df.format(j*0.393701));
			
			//increments i-inches by 1
			i=i+1; 
		
			//increments j- centimeters  by 5
			j=j+5; 
		
		 }
	}
}


