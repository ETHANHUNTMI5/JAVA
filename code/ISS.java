package code;

import java.util.Scanner;

public class ISS {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int l=0;l<t;l++)
		{
			int k =scn.nextInt();
			int N= 4*k+1+1;
			int [] ans = new int[N];
			int[] que= new int[N];
			
			for(int i=0;i<N;i++)
			{que[i]=i;
			}
			
			for(int p=2;p<N;p++)
			{
				if(que[p]==p)
				{
					que[p]=p-1;
				
		
				for(int i = 2*p;i<N;i+=p)
				{
					que[i]=(que[i]/p)*(p-1);
				}
				}
			}
			
		for(int i=1;i<N;i++)
		{
			ans[i]+=i-1;
		for(int j=2*i;j<N;j+=i)
		{
			ans[j]+=i*((1+que[j/i])/2);
		}
			
		}
		
		
		
	
		System.out.println(ans[4*k+1]);}
	}
	
	
	}


