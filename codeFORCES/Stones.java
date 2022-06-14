package codeFORCES;

import java.util.Scanner;

public class Stones {

	public static void main(String[] args) {
 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		String s = scn.nextLine();
		
		int ans=0;
		char pre=s.charAt(0);
		char cc;
		for(int a=1;a<n;a++)
		{
			
			cc= s.charAt(a);
			//System.out.println(cc);
			if(cc!=pre)
			{pre=cc;}
			else
			{ans++;}
			
			
		}
		System.out.println(ans);

	}

}
