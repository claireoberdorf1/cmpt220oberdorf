package lab3;

public class Problem4 {

	public static void main(String[] args) {
		//Finds the largest prime number under 15000
		int n;

		for(n=15000;n>0;n--){
			int c=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				c++;
		}
	}
		if(c==2)
		break;
		}
		System.out.println("The largest prime number that is less than 15000 is: "+n);

		}
	}