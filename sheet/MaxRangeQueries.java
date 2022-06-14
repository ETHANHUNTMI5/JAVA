package sheet;

import java.util.Scanner;

public class MaxRangeQueries {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int max=0;
			int n = scn.nextInt();
			int k = scn.nextInt();
			
			int [][] par = new int[n][2];
			
			for(int x=0;x<n;x++)
			{
				par[x][0]=scn.nextInt();
				par[x][1]=scn.nextInt();
				
				if(par[x][1]>max)
				{max=par[x][1];}
			}
			
			
			int [] arr = new int[max+2];
			
			for(int a=0;a<n;a++)
			{
				arr[par[a][0]]+=1;
				arr[par[a][1]+1]+=-1;
			}
			
			for(int a=1;a<max+2;a++)
			{
				arr[a]=arr[a]+arr[a-1];
			}
			
		   int[]kf = new int[max+2];
		   int[]kfp1 = new int[max+2];
		   
		   
		   for(int a=1;a<max+2;a++)
		   {
			   if(arr[a]==k)
			   {kf[a]+=1;}
			   
			   kf[a]=kf[a-1]+kf[a];
		   }
			
		   for(int a=1;a<max+2;a++)
		   {
			   if(arr[a]==k+1)
			   {kfp1[a]+=1;}
			   
			   kfp1[a]=kfp1[a-1]+kfp1[a];
		   }
//			for(int i : arr)
//			{System.out.print(i+" ");}
//			System.out.println();
//			for(int i : kf)
//			{System.out.print(i+" ");}
//			System.out.println();
//			for(int i : kfp1)
//			{System.out.print(i+" ");}
//			System.out.println();
			int ans=-1;
			
			for(int a=0;a<n;a++)
			{
			int get = (kf[par[a][0]-1])+(kf[max+1]-kf[par[a][1]])+(kfp1[par[a][1]]-kfp1[par[a][0]-1]);
			
			if(get>ans)
			{ans=get;}
			
			}
			System.out.println(ans);
		}
		
	}

}
