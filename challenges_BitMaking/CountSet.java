package challenges_BitMaking;

import java.util.Scanner;

public class CountSet {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			
			
			int count=0;
			while(n!=0)
			{
				if((n&1)==1)
				{count++;}
				
				n=n>>1;
				
			}
			
			System.out.println(count);
		}
		
		

	}

}
