package lab3;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		//Creates scanner and prints input text; creates string
		Scanner input = new Scanner(System.in);
        System.out.print("Input the string: ");
        String string = input.nextLine();
        
        //Prints text for number of vowels
        System.out.print("Number of  vowels in the string: " + count_Vowels(string)+"\n");
        input.close();
    }
	
 public static int count_Vowels(String string)
    {
        int count = 0;
        for (int i = 0; i < string.length(); i++)
        {
        	//Determines the vowels in the string; a, e, i, o, u 
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I'
                    || string.charAt(i) == 'O' || string.charAt(i) == 'U')
            {
                count++;
            }
        }
        return count;
    }
}

