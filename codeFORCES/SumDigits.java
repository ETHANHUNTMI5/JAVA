package codeFORCES;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		int n =0;
		
		for(int a=0;a<s.length();a++)
		{n = n+(int)s.charAt(a)-'0';
		}
		
	
		if(s.length()==1 || n ==0)
		{System.out.println(0);}
		else
		{		
		System.out.println(SumO(n, 1));
		}
		

	}
public static int NumOf(int n)
{
 
 int b=0;
 while(n!=0)
 {
	 b++;
	 n=n/10;
 }
return b;

}

public static  int SumO(int n,int ans)
{
	if(NumOf(n)==1)
	{return ans;}
	
	
	int b=0;
	while(n!=0)
	{
		b=b+n%10;
		n=n/10;
	}
	
	return SumO(b,ans+1);

}
}
