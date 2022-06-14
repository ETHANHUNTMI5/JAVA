package codeFORCES;

import java.util.Scanner;

public class Night {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		String s = scn.nextLine();
        int sum=0;
        int i =0;
		for(int a=0;a<s.length();a++)
		{
			char cc = s.charAt(a);
			int k = cc-97;
			
			int c1= Math.abs(k-i);
			sum=sum+Math.min(Math.abs(k-i),26-c1 );
			i=k;
		}
	
		System.out.println(sum);
		
	}
	

}
