package sheet;

import java.util.Scanner;

public class K_LCM {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			int k = scn.nextInt();
			
			
			if(n%2!=0)
			{
				
				System.out.print(n/2+" "+n/2+" "+1);
				
			}
			
			else
			{
				if((n/2)%2==0)
				{System.out.print(n/2+" "+(n/2)/2+" "+(n/2)/2);}
				else
				{
					int m=n/2;
					m=m-1;
					n = n-2*m;
					System.out.print(m+" "+m+" "+n);
				}
				
			}
			
		System.out.println();}
		
	}

}
