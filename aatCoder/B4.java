package aatCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long q = scn.nextLong();
		
		long[] arr = new long[(int) n];
		
		for(long a=0;a<n;a++)
		{
			arr[(int) a]= scn.nextLong();
			
		}
		
		long [] kar = new long[(int) n];
		
		for(long t =0;t<n;t++)
		{
			kar[(int) t]=arr[(int) t]-1-t;
			
		}
		
			for(long t=0;t<q;t++)
		{
			long p = scn.nextLong();
			
			if(p>kar[(int) (n-1)])
			{
				System.out.println(arr[(int) (n-1)]+p-kar[(int) (n-1)]);
			}
			
			else
			{
				long g = BinarySoch(kar, p);
				System.out.println(arr[(int) g]-1-kar[(int) g]+p);
				
			}
			
		}
	
	}
	public static long BinarySoch(long[] kar,long k)
	{
		long l=0;
		long h = kar.length-1;
		
		
		while(l<h)
		{
			long mid= (l+h)/2;
			
			if(kar[(int) mid]>=k)
			{
				h=mid;
			}
			
			else
			{
				l=mid+1;
			}
		
		}
		
		return l;
		
		
		
		
	}

}
