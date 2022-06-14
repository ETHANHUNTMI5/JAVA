package sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class K_LCM2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			int k = scn.nextInt();
			
			
			n=n-k+3;
			int [] arr = new int[k];

			
			for(int a=3;a<k;a++)
			{arr[a]=1;}
			
			int x=0,y=0,z=0;
			
			if(n%2!=0)
			{
				
				x=y=n/2;
				z=1;
			}
			
			else
			{
				if((n/2)%2==0)
				{x=n/2;
				y=z=(n/2)/2;}
				else
				{
					int m=n/2;
					m=m-1;
					n = n-2*m;
					x=y=m;
					z=n;
				}
				
				
			}
			arr[0]=arr[0]+x;
			arr[1]=arr[1]+y;
			arr[2]=arr[2]+z;
				
			for(int i : arr)
			{System.out.print(i+" ");}
			
		System.out.println();}
		
	}

}
 