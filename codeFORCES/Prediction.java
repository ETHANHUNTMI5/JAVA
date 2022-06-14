package codeFORCES;

import java.util.Scanner;

public class Prediction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m= scn.nextInt();
		
		boolean [] arr = new boolean[48];
		
		arr[0]= true;
		arr[1]= true;
		
		for(int a=2;a*a<=47;a++)
		{
			
			for(int multi = 2;a*multi<=47;multi++)
			{
				if(!arr[a*multi])
				{arr[a*multi]= true;}
				
			}
		}

		
		
		
		int a=n+1;
		
		while( n+1<48 && arr[a] )
		{
			a=a+1;
			
		}
		int ans= a;
		
		if(ans==m && n<47)
		{System.out.println("YES");}
		else
		{System.out.println("NO");}
	}

}
