package challenges_Array;

import java.util.Scanner;

public class Chewbacca2 {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		long n = scn.nextLong();
		long b=0,c=0;
		int k=0;
		long ans=0,ans1=0;
		while(n!=0)
		{
			b=n%10;
			ans=ans*10+b;
		n=n/10;
		k++;}
		if(b==9)
		{
			ans=ans/10;
			while(ans!=0)
			{
				b=ans%10;
				c=minimum2(b);
				ans1=ans1*10+c;
					ans=ans/10;
			}
			long t =(long)Math.pow(10, k-1);
			ans1=9*t+ans1;
			System.out.println(ans1);
		}
		else
		{	while(ans!=0)
		{
			b=ans%10;
		minimum(b);
		ans=ans/10;
		}
	}
		
		
		
	}
	public static void minimum(long b)
	{long c=0;int a=1;
	long ans =0;
		
		if(b>=5)
		{c=9-b;}
      
		else if(b<5)
		{c=b;}
	
		
		ans=ans*10+c;
	System.out.print(ans);
	}
	public static long minimum2(long b)
	 {
		long c=0;
		long ans =0;
		
			if(b>=5)
			{c=9-b;}
	      
			else if(b<5)
			{c=b;}
	
			return c;
	
		
	}
	
}

