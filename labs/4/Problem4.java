package lab4;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		//Creates scanner
		Scanner sc=new Scanner(System.in);

		//Tells user to enter a text 
		System.out.print("Enter a string of text: ");

		//Creates strings
		String str = sc.nextLine();
		String temp = "";

		//Determining the number of each character
			for(int i=0;i<str.length();i++){
				int count = 0;
				char c = str.charAt(i);

		//Checking if alphabetical, deletes white spaces and special symbols
			if(Character.isAlphabetic(c)){
				for(int j=0;j<str.length();j++){
					if(c==str.charAt(j)) count++;

				}

		//Prints the count for each character
		if(!temp.contains(c+"")) 
			System.out.println(c+" - "+count);

		temp+=c;

		sc.close();
		
			}

			}

	}
}

