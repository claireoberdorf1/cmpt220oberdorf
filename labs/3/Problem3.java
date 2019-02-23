package lab3;

public class Problem3 {

	public static void main(String[] args) {
		int total=1; 
		for(int i=1;i<=100;i++)

		{
		//Prints characters 1-100
		System.out.print((total++%20!=0) ? (char)i +" ": (char)i + "\n");

		if(i%20==0)

		System.out.println();

		}


	}

}
