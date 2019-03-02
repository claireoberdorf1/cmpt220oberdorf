package lab4;

import java.util.Random;

public class Problem5 {

	public static void main(String[] args) {
		
		//Creates double variable average and generates 1000 random integers
		double avg=0;
	    int[] a = new int[1000];
	    
	    //Create random class
	    Random rand = new Random();
	    
	    //Generates random integers and averages out the values
	    for(int i=0;i<1000;i++){
	    	a[i] = rand.nextInt(10000);
	        avg = avg + a[i];
	    }
	    
	        avg= avg / 1000.0;
	        
	        int count1=0,count2=0;
	    
	    //Determines which integers are lower and larger than the average
	    for(int i=0;i<1000;i++){
	        if(a[i] < avg)
	        	count1++;
	        
	        if(a[i] > avg)
	        	count2++;
	    }
	    
	    //Prints text to show user which numbers are lower and larger than the average
	    System.out.println("Number of integers lower than the average: "+count1);
	    System.out.println("Number of integers larger than the average: "+count2);
	}
}


