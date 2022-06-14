package basics;

import java.util.Scanner;

public class Pythogoras {
 
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		
	long num = scn.nextLong();
	pytho(num);
	}
 
	public static void pytho(long num)
	{	
		if(num==1 || num==2)
	{System.out.println(-1);
	return;}
	
		for(long i=1,j=i+1;;i++,j--)
		{
			if(2*i*j==num)
			{
			long x = (i*i)+(j*j);
			long y = (j+i)*(j-i);
			
			System.out.println(y+ " "+ x );
			}
			
			if(((j*j)-(i*i))==num)
			{
				long x=(j*j)+(i*i);
				long y = 2*j*i;
				
				System.out.println(y+ " "+ x );
						
				
		 		
			}
		}
		
		
	}
	}