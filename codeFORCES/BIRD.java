package codeFORCES;

import java.util.Scanner;

public class BIRD {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{arr[a]= scn.nextInt();}
		
		int m = scn.nextInt();
		for(int a=0;a<m;a++)
		{
			int x = scn.nextInt();
			int y = scn.nextInt();
			
			x=x-1;
			
			
			if(x-1>=0)
			{
				arr[x-1]=arr[x-1]+y-1;
			}
			if(x+1<n)
			{
				arr[x+1]= arr[x+1]+arr[x]-y;
			}

			arr[x]=0;
		}
		
		for(int i : arr)
		{System.out.println(i);}
	}
	

}
