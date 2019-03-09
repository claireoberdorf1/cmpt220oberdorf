package lab5;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		//Creates scanner object
		Scanner input = new Scanner(System.in);
		
		//Inputs the number of students 
		System.out.print("Enter number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];
		
		System.out.println("Enter the name of student and then his or her score.");
		
		for (int i = 0; i < students.length; i++) {
			//Inputs students name
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			//Inputs students score
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}
		
		//Calling the function that sorts students and scores in ascending order
		sortDecreasing(students, scores);
		
		//Writes the students names and scores
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i] + " " +  scores[i]);
		
		input.close();
		}
	}
	
	//Function to sort students scores in ascending order
	public static void sortDecreasing(String[] strings, int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int max = numbers[i];
			int maxIndex = i;
			String temp;
		for (int j = i + 1; j < numbers.length; j++) {
			if (numbers[j] > max) {
				max = numbers[j];
				maxIndex = j;
			}
		}
		
		if (maxIndex != i) {
			temp = strings[i];
			strings[i] = strings[maxIndex];
			strings[maxIndex] = temp;
			numbers[maxIndex] = numbers[i];
			numbers[i] = max;
		}
		}
	}
} 

