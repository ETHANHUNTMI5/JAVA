package basics;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int ans=0;
		while(n!=0)
		{int a=n%10;
			ans=ans*10+a;
		
		n=n/10;}
		
		System.out.println(ans);
	}

}
