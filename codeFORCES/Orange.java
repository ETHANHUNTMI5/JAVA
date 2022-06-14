package codeFORCES;

import java.util.Scanner;

public class Orange {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long b = scn.nextLong();
		long d = scn.nextLong();
		
	
		int count=0;
		long sum=0;
		for(int a=0;a<n;a++)
		{
			int x = scn.nextInt();
			if(x>b)
			{continue;}
			
			sum+=x;
			if(sum>d)
			{count++;
			sum=0;}
		}		
		System.out.println(count);
		
	}

}
