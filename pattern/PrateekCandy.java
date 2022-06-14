package pattern;

import java.util.Scanner;

public class PrateekCandy {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int p= scn.nextInt();
		
		for(int l=1;l<=p && p<=10000;l++)
		{int m= scn.nextInt();
		int n=10000;
		int k=0;
		for(int a=1;a<=n;a++)
       {
			int c=0;
			for(int b=1;b<=a;b++)
			{if(a%b==0)
			{c++;}	
			}
			if(c==2)
			{k++;}
			
	if(k==m)
	{System.out.println(a);
	break;}
	}}
	}
		
		//time error;

	
	}

