package aatCoder;

import java.util.Arrays;
import java.util.Scanner;

public class B5 {

	public static void main(String[] args) {
	
		long [] kar = {2,3,3,3};
		long k =3;
	BinarySoch(kar, k);
	}
	
	public static void BinarySoch(long[] kar,long k)
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
		
			System.out.println(l+" "+h);
		}
		
		System.out.println(l);
		
		
		
		
	}

}
