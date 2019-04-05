package lab7;

public class MyLongTest {
	public static void main(String[] args) {
	MyLong n1 = new MyLong(78);
	
	//Checks for even, odd, prime
	System.out.println("n1 is even? " + n1.isEven());
	System.out.println("n1 is odd? " + n1.isOdd());
	System.out.println("n1 is prime? " + n1.isPrime());
	
	//Converts array of numbers into a long value
	char[] chars = {'8', '4', '0', '5'};
	System.out.println(MyLong.parseLong(chars));
	
	//Converts a string into a long value
	String str = "36749";
	System.out.println(MyLong.parseLong(str));
	
	MyLong n2 = new MyLong(984);
	System.out.println("n2 is odd? " + n2.isOdd());
	System.out.println("n1 is equal to n2? " + n1.equals(n2));
	System.out.println("n1 is equal to 78? " + n1.equals(78));
}
}