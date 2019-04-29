package lab9;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		try{
			System.out.println("Enter Binary String:");
			String s = input.next();
			int integerValue = bin2Dec(Integer.parseInt(s));
			System.out.println("The decimal value of "+s+" is "+integerValue);
		}
	       
		catch(NumberFormatException e){
           System.out.println(e);	       
        }
		
		input.close();
	}  
	  
	public static int bin2Dec(int binaryNumber) throws NumberFormatException{
		int decimal = 0;
		int p = 0;
		
		try{
			while(true){
				if(binaryNumber == 0){
					break;
				} else {
					int temp = binaryNumber%10;
					decimal += temp*Math.pow(2, p);
					binaryNumber = binaryNumber/10;
					p++;
				}
			}
	   }
	// JA: Which action will throw this exception?
	   catch(NumberFormatException e){
	       throw new NumberFormatException("Invalid binary number");
	   }
	   return decimal;
	   }
	}