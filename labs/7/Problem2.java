package lab7;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();

		// Displays all the number's smallest factors in decreasing order
		System.out.print("The smallest factor(s) of " + num + ": ");
		
		//Creates and calls class StackOfIntegers
		StackOfIntegers stack = new StackOfIntegers(); 

		smallFactors(num, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		
		input.close();
	}

	public static void smallFactors(int num, StackOfIntegers stack) {
		int k = 2; 
		while (num / k != 1){ 
			if (num % k == 0) {
				stack.push(k);
				num = num / k;
			} else
				k++;
		}
		stack.push(num);
	}


}

