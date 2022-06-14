package aatCoder;

import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c=  scn.nextInt();
		
		if(c==0)
		{
			System.out.println("=");
		}
		
		
		
		if(c%2!=0)
		{
			if(a>b)
			{
				System.out.println(">");
			}
			else if(a<b)
			{
				System.out.println("<");
			}
			
			else
			{
				System.out.println("=");
			}
			
			
		}
		else
		{
			if(c%2==0)
			{
				if(Math.abs(a)>Math.abs(b))
				{
					System.out.println(">");
				}
				else if(Math.abs(a)<Math.abs(b))
				{
					System.out.println("<");
				}
				
				else
				{
					System.out.println("=");
				}
			}
			
					
				
				
				
			
			
		}
	}

}
