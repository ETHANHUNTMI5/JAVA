package aatCoder;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		
		long [] arr1 = new long[(int) n];
		long [] arr2 = new long[(int) n];
		long minidx  = 0;
		
		long total=0;
		for(long a=0;a<n;a++)
		{
			arr1[(int) a]= scn.nextLong();
		}
		for(long a=0;a<n;a++)
		{
		
			arr2[(int) a]= scn.nextLong();
		
			if(arr2[(int)a]<arr2[(int) minidx])
			{
				minidx = a;
			}
		
		}
		total=total+arr2[(int) minidx];
		
		long [] ans = new long[(int) n];
		
		ans[(int) minidx]= arr2[(int) minidx];
		
		for(long a=minidx+1;a<n+minidx;a++)
		{
			ans[(int) ((int) a%n)] = Math.min(arr1[(int) ((int) (a+n-1)%n)]+total, arr2[(int) ((int) a%n)]);
		
			total=ans[(int) ((int) (a)%n)];
		}
		
		for(long i : ans)
		{
			System.out.println(i);
		}
	}
	

}

