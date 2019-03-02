package lab4;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		//Creates scanner
		Scanner sc=new Scanner(System.in);

        //Creates int variables
		int size,i=0,j=0;

		//Prints text for user to enter size of array wanted and creates size variable
        System.out.print("Enter size of array: ");
        	size=sc.nextInt();

        //Creates array of size user wants
        int[] array=new int[size+1];
        array[size]=-1;

        //Asks user for values
        System.out.print("Enter values: ");

        //While loop to read thru values for duplicates
        while(i<size){
        	array[i]=sc.nextInt();
        	i++;
        }

        //Prints array
        System.out.print("Array before removing duplicates: \n\t");

        	//Closes scanner
        	sc.close();
        
        i=0;
        while(array[i]!=-1){
        	System.out.print(""+array[i]+", ");
        	i++;
        }

        //Finds and removes duplicates in array
        i=0;j=0;
        while(array[i]!=-1){
        	j=0;

            while(array[j]!=-1){
            	//If duplicates are found in array
            	if(array[i]==array[j] && i!=j){
            		int k=j;

                    //Removes duplicates
            		while(array[k]!=-1)
            			array[k]=array[++k];
            			array[k-1]=-1;
            	}
            		j++;
            }
            		i++;
        }

        //New line for arrays
        System.out.print("\n\t");
        
        //Prints array after removing duplicate
        System.out.print("Array after removing duplicates: \n\t");
        	i=0;

            while(array[i]!=-1){
            	System.out.print(""+array[i]+", ");
            	i++;

            }
         
	}

}






