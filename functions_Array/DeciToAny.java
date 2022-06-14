package functions_Array;

import java.util.Scanner;

public class DeciToAny {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int base= scn.nextInt();
	 int b=0,a=0,c=1,sum=0;
		while(n!=0)
		{b=n%base;
			a=b*c;
			sum=sum+a;
			
			c=c*10;
		n=n/base;}
		System.out.println(sum);
	}

}
