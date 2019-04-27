package lab9;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
			//Create an array with 100 random integers
			int[] array = new int[100];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 100);
			}
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an index: ");
			try {
				int index = input.nextInt();
				System.out.println("array[" + index + "] = " + array[index]);
			}
			catch (IndexOutOfBoundsException ex) {
				System.out.println(ex.getLocalizedMessage() + " is 'Out of Bounds'");
			}
			catch (Exception ex) {
				System.out.println("Invalid Input!");
				
			input.close();
			}

		}

	}


   

