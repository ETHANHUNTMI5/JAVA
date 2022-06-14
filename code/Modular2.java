package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Modular2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long t = scn.nextInt();
		
		while(t>0)
		{
			long n = scn.nextInt();
			long m = scn.nextInt();
			
			long count=0;
			ArrayList<Long > ll =new ArrayList<Long>();
			
			for(long b=1;b<=n+1;b++)
			{ll.add((long)1);}
			
			for(long i =2;i<=n;i++)
			{
				long a =m%i;
				
				count+=ll.get((int) a);
				System.out.println(i+"-->"+a+" ==> "+count);
				System.out.println(ll);
				for(long j=a;j<=n;j=j+i)
				{
					long get = ll.get((int)j);
					ll.set((int) j,get+1);
				}
				System.out.println(ll);
				System.out.println("*************");
			}
			
			System.out.println(count);
			System.out.println(ll);
			
			
			
			
		t--;}

	}

}
