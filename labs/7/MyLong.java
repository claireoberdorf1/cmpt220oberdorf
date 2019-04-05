package lab7;

public class MyLong {
private long value;
	
	MyLong(long value){
		this.value = value;
	}
	
	long getValue() {
		return value;
	}
	
	boolean isEven() { 
		return (value%2) == 0;
	}
			
	boolean isOdd() { 
		return !isEven();
	}
	
	boolean isPrime() {
		for (int k = 2; k < value / 2; k++) {
			if(value%k == 0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isEven(MyLong value) {
		return value.isEven();	
	}
	
	static boolean isOdd(MyLong value) {
		return value.isOdd();
	}
	
	static boolean isPrime(MyLong value) {
		return value.isPrime();
	}

	boolean equals(long value) {
		return this.value == value;
	}
	
	boolean equals(MyLong value) {
		return this.value == value.getValue();
	}
	
	static long parseLong(char[] value) {
		return parseLong(new String(value));
	}
	
	static long parseLong(String value) {
		return Long.parseLong(value);
	}

	
	
}
