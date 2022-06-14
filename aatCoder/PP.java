package aatCoder;

import java.util.Scanner;

public class PP {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int w=1;w<=t;w++)
		{
			int n = scn.nextInt();
			
			int [] arr = new int[2*n];
			int odd=0;
			
			for(int a=0;a<2*n;a++)
			{
				arr[a]= scn.nextInt();
				if(arr[a]%2!=0)
				{
					odd++;
				}
			}
			
			if(odd==n)
			{
				System.out.println("Yes");
				
			}
			
			else
			{
				System.out.println("No");
			}
		}
	}

}
