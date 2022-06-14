package code;

import java.util.Scanner;

public class ChefLandVisa {

	public static void main(String[] args) {

		 Scanner scn = new Scanner(System.in);
		 int t = scn.nextInt();
		 
		 for(int w=1;w<=t;w++)
		 {
			 int x1= scn.nextInt();
			 int x2 = scn.nextInt();
			 int y1= scn.nextInt();
			 int y2 = scn.nextInt();
			 int z1= scn.nextInt();
			 int z2 = scn.nextInt();
			 
			 
			 if(x2>=x1 && y2>=y1 && z1>=z2)
			 {
				 System.out.println("Yes");
				 
			 }
			 else
			 {
				 System.out.println("No");
			 }
		 }
	}

}
