package abc;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n= scn.nextLong();
		long[] arr = new long[(int)n];
		
		for(long a=0;a<n;a++)
		{arr[(int)a]= scn.nextLong();}
		long [] arr2 = new long[(int) (n+1)];
		System.out.println(kar(arr, 0, 0, 0));
		//System.out.println(kar2(arr,0 , 0, 0, arr2));
		
		for(long l : arr2)
		{System.out.print(l+" ");}
		
	}
	public static long kar(long [] arr,long pow,long vi,long t)
	{
		if(pow<0)
		{return t-1;}
		
		if(vi==arr.length)
		{
			return t;
		
		}
		
		
		long re=0;
		
		long i=0;
		long e=0;
		
		if(arr[(int)vi]>=0)
		{
			i = kar(arr, pow+arr[(int)vi], vi+1,t+1);
			e = 0;
		}
	
		else
		{
			if(pow+arr[(int)vi]>=0)
			{i = kar(arr, pow+arr[(int)vi], vi+1,t+1);}
			
			e = kar(arr, pow, vi+1,t);
		}
		
		re= Math.max(i, e);
		
		
  return re;
		
	}
	public static long kar2(long [] arr,long pow,long vi,long t,long[]arr2)
	{
		if(pow<0)
		{return t-1;}
		
		if(vi==arr.length)
		{
		
		return t;
		
		}
		
		if(arr2[(int)vi]!=0)
		{
			return arr2[(int)vi];
		}
		
		long re=0;
		
		long i=0;
		long e=0;
		
		if(arr[(int)vi]>=0)
		{
			i = kar2(arr, pow+arr[(int)vi], vi+1,t+1,arr2);
			e = t;
		}
	
		else
		{
			if(pow+arr[(int)vi]>=0)
			{i = kar2(arr, pow+arr[(int)vi], vi+1,t+1,arr2);}
			
			e = kar2(arr, pow, vi+1,t,arr2);
		}
		
		
		re= Math.max(i, e);
		System.out.println(re+" "+vi);
		
		
		if(re>arr2[(int)vi])
		arr2[(int)vi]=re+t;
		
  return re;
		
	}

}

