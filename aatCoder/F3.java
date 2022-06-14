package aatCoder;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		
		
		kar(n,"");
		
	}
 public static void kar(long n,String ans)
 {
if(n==0)
{System.out.println(ans);
return;}


	
	if(n%2==0)
	{
		kar(n/2,"B"+ans);
		
	}
	
	else
	{
		kar(n-1,"A"+ans);
	}
}
}
