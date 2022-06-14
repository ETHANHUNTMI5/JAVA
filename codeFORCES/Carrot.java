package codeFORCES;

import java.util.Scanner;

public class Carrot {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = scn.nextInt();
		int k = scn.nextInt();
		int d = scn.nextInt();
		
		
		int t1 = 0;
		int a=1;
		while(k*a<n)
		{
			a++;
		}
		t1 = a*t;
		
		int b=1;
		while(2*k*b<n-k*d/t)
		{
			b++;
		}
		int t2 = d + b*t; 
		
		if(t1>t2)
		{System.out.println("Yes");}
		
		else
		{System.out.println("No");}
		
		
		}

}
