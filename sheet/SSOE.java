package sheet;

import java.util.Scanner;

public class SSOE {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int w=1;w<=t;w++)
		{
		int l = scn.nextInt();
		int r = scn.nextInt();
		
		for(int a=l;a<=r;a++)
		{
		boolean b =checkprime(a);

		if(b)
		{System.out.println(a);}
		}
		
		System.out.println();}
		
	}
	public static boolean checkprime(int n)
	{
		
		for(int a=2;a*a<=n;a++)
		{
			if(n%a==0)
				return false;
		}
		
		return true;
		
	}

}
