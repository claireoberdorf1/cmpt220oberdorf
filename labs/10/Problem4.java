package lab10;

import java.util.Arrays;

public class Problem4 {
	  
	public static void main(String[] args) {
	    Appliance appliances[] = new Appliance[40];
	    appliances[0] = new TV("39", "Samsung", "4K", 600, "Black", "Japan", 399);
	    appliances[1] = new Toaster("4", "Hamilton Beach", "plastic", 200, "Black", "Korea", 100);
	    appliances[2] = new TV("32", "Vizio", "2K", 600, "Black", "China", 350);
	    appliances[3] = new TV("42", "Sharp", "3K", 600, "Black", "Korea", 445);
	    appliances[4] = new Telephone("Verizon", "Apple", "8G", 100, "Black", "Japan", 599);
	    appliances[5] = new Toaster("2", "Hamilton Beach", "stainless steel", 200, "Grey", "China", 75);
	    appliances[6] = new Telephone("AT&T", "Apple", "56G", 100, "Black", "China", 699);
	    appliances[7] = new Telephone("AT&T", "Samsung", "64G", 100, "Black", "Korea", 799);
	    appliances[8] = new Toaster("4", "Cuisinart", "stainless steel", 200, "Grey", "China", 150);
	    appliances[9] = new TV("56", "Smart", "5K", 600, "Black", "Japa", 799);
	    appliances[10] = new TV("42", "Vizio", "3K", 600, "Black", "Korea", 850);
	    appliances[11] = new Toaster("6", "Cuisinart", "plastic", 200, "Black", "Japan", 200);
	    appliances[12] = new TV("64", "Samsung", "6K", 600, "Black", "China", 990);
	    appliances[13] = new TV("28", "Vizio", "2K", 600, "Black", "China", 199);
	    appliances[14] = new Telephone("Sprint", "Apple", "8G", 100, "Black", "Japan", 499);
	    appliances[15] = new Toaster("2", "KitchenAid", "stainless steel", 200, "Grey", "Korea", 75);
	    appliances[16] = new Telephone("Verizon", "Samsung", "64G", 100, "Black", "China", 799);
	    appliances[17] = new Telephone("Verizon", "Apple", "120G", 100, "Black", "China", 999);
	    appliances[18] = new Toaster("6", "KitchenAid", "stainless steel", 200, "Grey", "Korea", 225);
	    appliances[19] = new TV("39", "Samsung", "4K", 600, "Black", "Japan", 299);
	    appliances[20] = new TV("28", "Vizio", "2K", 600, "Black", "Korea", 150);
	    appliances[21] = new Toaster("4", "Hamilton Beach", "plastic", 200, "Black", "Korea", 100);
	    appliances[22] = new TV("42", "Samsung", "3K", 600, "Black", "China", 345);
	    appliances[23] = new TV("38", "Smart", "4K", 600, "Black", "Japan", 550);
	    appliances[24] = new Telephone("Sprint", "Apple", "8G", 100, "Black", "Korea", 499);
	    appliances[25] = new Toaster("2", "KitchenAid", "plastic", 200, "Black", "Korea", 50);
	    appliances[26] = new Telephone("Verizon", "Apple", "56G", 100, "Black", "Japan", 899);
	    appliances[27] = new Telephone("AT&T", "Apple", "64G", 100, "Black", "China", 899);
	    appliances[28] = new Toaster("6", "Cuisinart", "stainless steel", 200, "Grey", "China", 200);
	    appliances[29] = new TV("64", "Smart", "6K", 600, "Black", "Korea", 1200);
	    appliances[30] = new TV("24", "Smart", "2K", 600, "Black", "Japan", 550);
	    appliances[31] = new Toaster("2", "Hamilton Beach", "plastic", 200, "Black", "China", 50);
	    appliances[32] = new TV("55", "Vizio", "3K", 600, "Black", "Korea", 999);
	    appliances[33] = new TV("54", "Samsung", "3K", 600, "Black", "Japan", 899);
	    appliances[34] = new Telephone("Sprint", "Samsung", "120G", 100, "Black", "Japan", 899);
	    appliances[35] = new Toaster("4", "Cuisinart", "stainless steel", 200, "Grey", "Korea", 100);
	    appliances[36] = new Telephone("Verizon", "Apple", "56G", 100, "Black", "China", 699);
	    appliances[37] = new Telephone("Verizon", "Apple", "8G", 100, "Black", "Korea", 599);
	    appliances[38] = new Toaster("8", "KitchenAid", "plastic", 200, "Black", "Japan", 225);
	    appliances[39] = new TV("39", "Smart", "3K", 600, "Black", "Korea", 550);
	  
	    //Sorts the appliances
	    Arrays.sort(appliances);
	    for(Appliance app:appliances) {
	        System.out.println(app);
	    }

	}

}
