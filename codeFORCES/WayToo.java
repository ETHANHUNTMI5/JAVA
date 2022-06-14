package codeFORCES;

import java.util.Scanner;

public class WayToo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		
		for(int a=0;a<n;a++)
		{String s = scn.nextLine();
		
		if(s.length()<=10)
		{System.out.println(s);}
		else
		{
			int le= s.length()-2;
			System.out.println(s.charAt(0)+""+le+""+s.charAt(s.length()-1));
		}
		
		}
		

	}

}
