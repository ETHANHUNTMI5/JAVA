package challenges_DP;

import java.util.Scanner;

public class MinJumps {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
	for(int l=0;l<t;l++)
	{	int n = scn.nextInt();
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{arr[a]=scn.nextInt();}
		
		int [] ans = new int[n];
		ans[n-1]=0;
		
		for(int d=0;d<n-1;d++)
		{ans[d]=100000;}
		
		for(int a=n-2;a>=0;a--)
		{
			int k= arr[a];
			
			if(k==0)
			{
			
				continue;
			}
			for(int b=1;b<=k;b++)
			{
				if(a+b<=n-1)
				ans[a]= Math.min(ans[a], ans[a+b]+1);
				else if(a+b==n)
				{ans[a]=1;}
				
			}
		}

		System.out.println(ans[0]);
	}
	}

}
