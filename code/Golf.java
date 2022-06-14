package code;

import java.util.Scanner;

public class Golf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		for(int w=0;w<t;w++)
		{
			
			long N = scn.nextLong();
			long x = scn.nextLong();
			long k = scn.nextLong();
			
			if(x%k==0 || (N+1-x)%k==0)
			{System.out.println("YES");}
			
			else
			{System.out.println("NO");}
		
		}
	
	}
	
}