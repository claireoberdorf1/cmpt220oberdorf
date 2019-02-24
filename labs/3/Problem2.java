package lab3;

public class Problem2 {

	public static void main(String[] args) {
		//Creates int variable 100-500
		int count=0;
		
		for(int i=100; i<=500; i++) {
			if(count<10)
			
			//Determines if divisible by 5 or 7
			if((i%5==0 && i%7!=0) || (i%5!=0 && i%7==0)) {
				System.out.print(i+" "); // JA
				count++;
			}
			if(count==10) {
				System.out.println();
					count=0;
			}
		}
	}

}
