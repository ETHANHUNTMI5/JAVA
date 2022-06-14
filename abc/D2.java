package abc;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		
		
	for(int b=s.length()-1;b>=0;b--)
	{
		char cc = s.charAt(b);
		if(cc=='6')
		{System.out.print("9");}
		else if(cc=='9')
		{System.out.print("6");}
		else
		{System.out.print(cc);}
		
	}
		
	
	}

}
