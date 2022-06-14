package code;

import java.util.ArrayList;
import java.util.Scanner;


public class ChefvsBharat {
	public static final  long co = (1000000000)+7;
	public static void main(String[] args) {
		
		ArrayList<Long> ll2 = new ArrayList<Long>();
		ll2.add((long) 0);
		ArrayList<Long> ll3 = new ArrayList<Long>();
		ll3.add((long) 0);
		for(int b=1;b<=100000;b++)
		{
			long fp = b;
			long l = b/10;
			long c=0;
			long rev=0;
			while(l!=0)
			{
				rev=rev*10+l%10;
				l=l/10;
				c++;
			}
			
			long ten = (long) Math.pow(10, c);
			
			ll2.add(fp*ten+rev);
		}
		
		
		for(int b=1;b<=100000;b++)
		{
			ll3.add(ll2.get(b)+ll3.get(b-1));
		}
		
//		for(int b=0;b<=11;b++)
//		{
//			System.out.print(ll2.get(b)+" ");
//		}
//		System.out.println();
//		for(int b=0;b<=11;b++)
//		{
//			System.out.print(ll3.get(b)+" ");
//		}
		Scanner scn = new Scanner(System.in);
		long t = scn.nextLong();
		
		for(long w=1;w<=t;w++)
		{
			long l = scn.nextLong();
			long r = scn.nextLong();
			
			long ans=1;
			
			long g = ll2.get((int) l);
			
			long dif = ll3.get((int) r)-ll3.get((int) l);
				ans = ((fastpower(g, dif)%co))%(co);
			
			System.out.println(ans);
		}
		
		
	}
	
	public static long fastpower(long x, long y)
	{
	    long temp;
	    if( y == 0)
	        return 1;
	    temp = fastpower(x, y / 2);
	    if (y % 2 == 0)
	        return ((temp%co)*(temp%co))%co;
	    else
	        return (x%co*temp%co*temp%co)%co;
	}}
