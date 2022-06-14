package sheet;

import java.util.Scanner;

public class InterestingSubarr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			
			int l =-1;
			int r=-1;
		
			int []  arr = new int[n];
		    
			for(int a=0;a<n;a++)
			{
				arr[a]=scn.nextInt();
			}
			for(int a=1;a<n;a++)
			{
				if(Math.abs(arr[a]-arr[a-1])>=2)
				{
					l=a-1; 
					r=a;
					break;
				}
			}
			
			if(l==-1 && r==-1)
			{System.out.println("NO");}
			else
			{
				System.out.println("YES");
				System.out.println((l+1)+" "+(r+1));
			}
			
		}
	}

}
