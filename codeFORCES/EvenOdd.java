package codeFORCES;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long n = scn.nextLong();
		long k = scn.nextLong();
	
		if(n%2==0)
		{
			if(k>n/2)
			{System.out.println(2*(k-n/2));}
			else
			{
				System.out.println(2*k-1);;
			}
		}
		else
		{
			if(k>n/2+1)
			{System.out.println(2*(k-n/2-1));}
			else
			{
				System.out.println(2*k-1);;
			}
			
		}
		
	}}