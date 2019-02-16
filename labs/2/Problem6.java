//Creates a random phone number (xxx) xxx-xxxx
package lab2;

import java.util.Random;

public class Problem6 {

	public static void main(String[] args) {
		// Creates random
		Random random = new Random();
		
		// Creates the number variables for each placement in phone number 
        int n1 = random.nextInt(8) + 2; // Can't be zero or one
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);
        int n4 = random.nextInt(10);
        int n5 = random.nextInt(10);
        int n6 = random.nextInt(10);
        int n7 = random.nextInt(10);
        int n8 = random.nextInt(10);
        int n9 = random.nextInt(10);
        int n10 = random.nextInt(10);
        
        // Creates a string format of the number (xxx) xxx-xxxx
        String PhoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d", n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        System.out.println(PhoneNumber);
	}

}
