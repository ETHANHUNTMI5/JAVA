package aatCoder;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		int ans =0;
		
		for(int a=1;a<=t;a++)
		{
			int n = scn.nextInt();
			
			if(n>=10)
			{ans=ans+(n-10);}
			
		}
	 
		System.out.println(ans);
	}

}
