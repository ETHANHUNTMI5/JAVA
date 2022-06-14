package codeFORCES;

import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int grp=0;
		int pre=0;
		for(int a=0;a<n;a++)
		{
			int b= scn.nextInt();
			if(b!=pre)
			{
				grp++;
			}
			pre=b;
				
		}
		
		System.out.println(grp);
		
	}

}
