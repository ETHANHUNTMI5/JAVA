package abc2;

import java.util.Scanner;

public class Hoop {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			
			if(n==1)
			{System.out.println("1");
			continue;}
			
			else
			{
				int ans = n/2+1;
				System.out.println(ans);
				
			}
			
			
			
		}
	}

}
