package basics;

import java.util.Scanner;

public class NS_CON {

	public static void main(String[] args) {
		Scanner scn = new  Scanner(System.in);
		int n = scn.nextInt();
		int base = scn.nextInt();
		int base2 = scn.nextInt();
		
		int rem=0,sum=0,b=0;
		int a=1;
		while(n!=0)
		{rem=n%base;
			
			b=rem*a;
		
		n=n/base;
		a=a*base2;
		sum=sum+b;}
		System.out.println(sum);
	
	}
	

}
