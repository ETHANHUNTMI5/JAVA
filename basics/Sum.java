package basics;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int sum=0;
		for(int a=1;a<=n;a++)
		{
			sum=sum+a;
		}
		
		System.out.println(sum);
	}

}
