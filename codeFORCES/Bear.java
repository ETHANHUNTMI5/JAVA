package codeFORCES;

import java.util.Scanner;

public class Bear {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int sm= scn.nextInt();
		int lm = scn.nextInt();
		
		int year=0;
		
		while(lm>=sm)
		{
			year=year+1;
			
			lm=lm*2;
			sm=sm*3;
		}
	   System.out.println(year);	
	}

}
