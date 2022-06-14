package code;

import java.util.Scanner;

public class CC1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=0;w<t;w++)
		{
			int x = scn.nextInt();
			int a = scn.nextInt();
			int b = scn.nextInt();
			
			int ans = ((100-x)*b+a)*10;
			System.out.println(ans);
		}
		
  
	}

}
