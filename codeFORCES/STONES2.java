package codeFORCES;

import java.util.Scanner;

public class STONES2 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		int a=0;
		
		
			
			for(int b=0;b<s2.length();b++)
			{
				if(a==s1.length())
				{break;}
				char c1 = s1.charAt(a);
				char c2 = s2.charAt(b);
				
				if(c1==c2)
				{a++;}
			}
			
			System.out.println(a+1);
		
		
	}

}
