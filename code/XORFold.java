package code;

import java.util.Scanner;

public class XORFold {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int one=0;
			int row=scn.nextInt();
			int col = scn.nextInt();
			
			scn.nextLine();
			for(int a =0;a<row;a++)
			{
				String s = scn.nextLine();
				
				for(int b=0;b<col;b++)
				{
					char cc = s.charAt(b);
					
					if(cc=='1')
					{one++;}
				}
				
			}
			
			if(one%2==0)
			{System.out.println("NO");}
			else
			{System.out.println("YES");}
		}
	}

}
