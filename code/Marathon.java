package code;

import java.util.Scanner;

public class Marathon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{int ans=0;
			int D = scn.nextInt();
			int d = scn.nextInt();
			int A = scn.nextInt();
			int B = scn.nextInt();
			int C = scn.nextInt();
			
			int m1=10,m2=21,m3=42;
			
			int total=d*D;
			
			if(total>=42)
			{
				ans=C;
			}
			else if(total>=21 && total<42)
			{
				ans=B;
			}
				
			else if(total>=10 && total<21)
			{
				ans=A;
			}
			
			else
			{ans=0;}
			
		
		System.out.println(ans);}
		
		
	}

}
