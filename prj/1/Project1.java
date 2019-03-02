package project1;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args){
		//Declares int variables for height, width, and number of bricks
		int h = 0; //Current height of the wall
		int w = 0; //Current width of the wall
		int nb = 0; //Current number of bricks in the pile

		//Creates scanner object
        Scanner input = new Scanner(System.in);
        h = input.nextInt(); //Height of the wall
        w = input.nextInt(); //Width of the wall
        nb = input.nextInt(); //Number of bricks in the pile
       
        //Take the input of brick length
        boolean completedWall = false;
        int width = 0; //Current width until bricks are filled
        int height = 0; //Current height until bricks are filled
       
        //While loop with nested if and else if statements
        //If number of bricks does not equal zero continue
        //Determines if current height and widths are less than heights(h) and widths(w)
        while (nb!=0){
            nb--;
            int s = 0;
            s = input.nextInt();
            if (height < h){
                width += s;
                if (width == w){
                    ++height;
                    width = 0;
                } 
                
                else if (width > w){
                    height = h + 1;
                }
                
                if (height == h)
                    completedWall = true;
            }
        }
        //Successfully completed
        if (completedWall){
            System.out.println("YES");
        }
        //Not completed
        else {
            System.out.println("NO");
        }
        
        input.close();
    }
}











