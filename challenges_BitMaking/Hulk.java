package challenges_BitMaking;

import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		for(int a=1;a<=t;a++)
		{
			int n = scn.nextInt();
			int m=n;
		
		System.out.println(kar(n, m));	
			
		}
		
	}
	public static int kar(int n,int m)
	{
	
		if(n<=0)
		{return 0;}
		if(n==1)
		{return n;}
		
		
		int i=1;
		int t=n;
		while((n^1)!=0)
		{
			n=n>>1;
		 i=i<<1;	
		}
	int ans=1;
	ans =	ans+kar(t-i, m);
	
	return ans;
	}

}
