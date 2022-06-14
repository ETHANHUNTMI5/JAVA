package codeFORCES;

import java.util.Scanner;

public class GoodNum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		int n = scn.nextInt();
		int k = scn.nextInt();
		long [] arr = new long[n];
		int count=0;
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextLong();
			long x=arr[a];
			
			long b=0;
			while(x!=0)
			{
				b = x%10;
				
				if(b>k)
				{break;}
				
				x=x/10;
			}
			if(b<=k)
			{System.out.println(a);
				count++;}
		}
		System.out.println(count);
		
	}

}
