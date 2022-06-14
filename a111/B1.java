package a111;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B1 {
public static Set<Long>visited = null;
public static long ans=0;
public static boolean bl = false;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		visited = new HashSet<>();
		
		long a = scn.nextInt();
		long N = scn.nextInt();
		bl=false;
		if(N==1)
		{System.out.println(0);}
		else
		{
			long max =0;
			long m =N;
			while(N!=0)
			{
			N=N/10;
			max++;	
			}
			
			System.out.println(kar(1,m,a,max)-1);
		}
		if(!bl)
		System.out.println(-1);
	}
	
	public static long kar(long a,long N,long b,long max_digits)
	{	System.out.println(a);
		if(a==N)
		{bl=true;
		return 1;}
		
		if(a>=(long)(Math.pow(10, max_digits)))
		{return 10000000;}
		
		
		
		long l =10000000;
		long r =10000000;
		
		if(a>10 && a%10!=0)
		{long get = reverse(a);
		
			if(!visited.contains(get))
			{visited.add(get);
			l=kar(get,N,b,max_digits);}
		}
		
		if(!visited.contains(a*b))
		{visited.add(a*b);
			r=kar(a*b,N,b,max_digits);}
		
		
		return Math.min(l,r)+1;
	}
	
	public static long reverse(long n)
	{
		long a=0;
		long b=0;
		while(n!=0)
		{
			b=n%10;
			n=n/10;
			a=a*10+b;
		}
		return a;
	}
}