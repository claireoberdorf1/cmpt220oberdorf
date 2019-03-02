package lab4;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		//Prints text for user to type in a string
		System.out.print("Enter a string: ");

		//Creates scanner and string
		Scanner read = new Scanner(System.in);
		String S = read.nextLine();
		
		//Creates loop to determine if palindrome
		if(isPalindrome(S)){
			
			//Prints if string is a palindrome
			System.out.println("The string is Palindrome.");
			read.close();
		}
			else{
				//Prints if string is not a palindrome
				System.out.println("The string is not Palindrome.");
			}
	}
		
	//Reverses a string
	public static String reverse(String S){
		String temp = "";
		for(int i=S.length()-1 ; i>=0 ;i--){
			temp = temp + S.charAt(i);
		}
		
			return temp;
	}
		
	//Implements isPalindrome
	public static boolean isPalindrome(String S){
		int flag = 1;
		String S_reversed = reverse(S);
			for(int i=0 ; i<S.length(); i++){
				if(S.charAt(i) != S_reversed.charAt(i)){
					flag = 0;
		
					break;
				}
			}
			
			if(flag==0){
				return false;
			}
			
			else{
				return true;
			}
	}
		
}

	