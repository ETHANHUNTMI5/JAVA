package abc;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
	
		for(int w=1;w<=t;w++)
		{
			long n = scn.nextLong();
			long m = n;
			if(n<11)
			{System.out.println("NO");
			continue;}
			

			else
			{
				long a=0;
				while(n!=0)
				{
					a++;
					n=n/10;
				}
				
				n=m;
				long b=1;
				long get=1;
				while(b!=a)
				{
					get = (long) (get+Math.pow(10, b));
				
				b++;}
				
				long max=get;
				
				if(n<get)
				{
					max=get/10;
				}
				
				System.out.println(max);
				
			}
			
			
		}
		
	}

}
