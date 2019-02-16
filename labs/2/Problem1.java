//Compares two numbers
package lab2;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// Creates scanner
		Scanner input = new Scanner(System.in);
		int number1,number2;
		//First number n1
		   System.out.println("Enter first number");
		   number1 = input.nextInt();
		//Second number n2
		   System.out.println("Enter second number");
		   number2 = input.nextInt();
		//Compares first and second number
		   System.out.println(number1+" less than "+number2 +"? "+(number1 < number2));
		   System.out.println(number1+" less than or equal to "+number2 +"? "+(number1 <= number2));
		   System.out.println(number1+" equal to "+number2 +"? "+(number1 == number2));
		   System.out.println(number1+" not equal to "+number2 +"? "+(number1 != number2));
		   System.out.println(number1+" greater than "+number2 +"? "+(number1 > number2));
		   System.out.println(number1+" greater than or equal to "+number2 +"? "+(number1 >= number2));
		   
		   input.close();
	}

}
