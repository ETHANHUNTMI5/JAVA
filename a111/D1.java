package a111;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int []operations= new int[10000];
		Arrays.fill(operations, Integer.MAX_VALUE);
		operations[1]=0;
		for (int i = 1; i <= 1000; i++) {
            for (int j= 1; j <= i; j++) {
                operations[i + i/j] = Math.min(operations[i + i/j], operations[i] + 1);
            }
        }
		
		long t = scn.nextLong();
		
		for(long wt=1;wt<=t;wt++)
		{
			long n = scn.nextLong();
			long k = scn.nextLong();
			
			long [] wts = new long[(int) n];
			
			Set<Long> check = new HashSet<Long>();
			check.add((long)0);
			long val=1;
			for(long p=1;p<=32;p++)
			{
				
				check.add(val);
				val=val*2;
			}
			
			for(int a=0;a<n;a++)
			{
				wts[a]=scn.nextLong();
				wts[a] = operations[(int) wts[a]]; 
			}
			
			long [] price = new long[(int) n];
			for(int a=0;a<n;a++)
			{
				price[a]=scn.nextLong();
			}
			long total=0;
			for (long i: wts) total += i;
			
	        if (total <= k) {
	            int res = 0;
	            for (long j: price) res += j;
	            System.out.println(res);
	            continue;
	        }
			
			System.out.println(KSBU(wts, price, k));
		}
	}
	public static long KSBU(long [] wt, long [] price,long cap)
	{
		long n = wt.length;
	    long [][] arr = new long[(int) (n+1)][(int) (cap+1)];
		
	   for(long row=n-1;row>=0;row--)
	   {
		   for(long col=1;col<=cap;col++)
		   {
			   long e = arr[(int) (row+1)][(int) col];
			   long i=0;
			  
			   if(col>=wt[(int) row])
			   {
				   i = arr[(int) (row+1)][(int) (col-wt[(int) row])]+price[(int) row];
			   }
			   arr[(int) row][(int) col]= Math.max(i, e);
			   
			  
			   
		   }
		   
	   }
	   
	   
	   return arr[0][(int) cap];}
	 
}