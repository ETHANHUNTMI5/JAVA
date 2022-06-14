package code;

import java.util.Scanner;

public class Xoor {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	long t = scn.nextInt();
	
	for(long w=1;w<=t;w++)
	{
		long n = scn.nextInt();
		long k = scn.nextInt();
		
		long [] arr = new long[(int) n];
		
		long max=0;
		
		for(long a=0;a<n;a++)
		{
			
			arr[(int) a]= scn.nextInt();
			
			if(arr[(int) a]>max)
			{
				max=arr[(int) a];
			}
		}
		
		
		
	
		long l=0;
		
		while(Math.pow(2, l)<=max)
		{
			l++;
			
		}
	
		long[] twos= new long[(int) l];
		
		
		for(long a=0;a<n;a++)
		{
			long g = arr[(int) a];
			long b=0;
			
			
			while(g!=0)
			{
			if((g&1)!=0 && b<l)
			{
				twos[(int) b]=twos[(int) b]+1;
			}
			g=(g>>1);
			b++;
		}
		
	
	}
		long ans=0;
		for(long a=0;a<l;a++)
		{
			if(twos[(int) a]%k==0)
			{
				ans+= twos[(int) a]/k;
			}
			else
			{
				ans+=(twos[(int) a]/k)+1;
			}

				
		}
		System.out.println(ans);
	}
	}
}
