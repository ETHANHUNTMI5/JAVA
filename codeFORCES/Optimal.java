package codeFORCES;

import java.util.Scanner;

public class Optimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		for(int a=0;a<n;a++)
		{
			arr[a]=scn.nextInt();
		}
		
		int x=0;
		int y=0;
		int si=0;
		int ei =n-1;
		int t=1;
		while(t!=n+1)
		{
			if(t%2!=0)
			{	if(arr[si]>arr[ei])
			{
				x=x+arr[si];
				si++;
			}
			else
			{x=x+arr[ei];
			ei--;}
			}
			else
			{
				if(arr[si]>arr[ei])
				{
					y=y+arr[si];
					si++;
				}
				else
				{y=y+arr[ei];
				ei--;}	
			}
		
		t++;}
		
		System.out.println(x+" "+y);
	}

}
