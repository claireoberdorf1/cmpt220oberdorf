package lab4;

public class Problem6 {

	public static void main(String[] args) {
		//The end of the list is represented by the value -1
		int a[]={-1};

		//Insert numbers 1-10 into the array
		for(int i=1;i<=10;i++){
			a=addInt(a,i);
		}

		//Prints array
		System.out.println("Array: ");
			for(int i:a) System.out.print(i+" ");
			System.out.println();

		//Insert 10 in position 3
		a=insert(a,10,3);
		System.out.println("\n10 inserted at position 3");
			for(int i:a) System.out.print(i+" ");
			System.out.println();

		//Insert 100 in position 7
		a=insert(a,100,7);
		System.out.println("\n100 inserted at position 7");
			for(int i:a) System.out.print(i+" ");
			System.out.println();

	}

		
	//Adds numbers to specific positions
	private static int[] insert(int a[],int i, int j) {
		a[j]=i;

		return a;
		}

	//Adds number to end of list
	private static int[] addInt(int[] a, int n) {
		int b[]=new int[a.length+1];
		for(int i=0;i<a.length-1;i++){
			b[i]=a[i];
		}

		b[b.length-2]=n;

		b[b.length-1]=-1;

		return b;

		}
}



