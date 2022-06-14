package basics;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int div=2;
		boolean b=true;
		while(div<=n-1)
		{
			if(n%div==0)
			{b=false;}
				
		div++;}
		
		if(b==false)
		{System.out.println("Not Prime");}
		else
		{System.out.println("Prime");}
	}

}
