package codeFORCES;

import java.util.Scanner;

public class HardExam {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		
		
		if(n%4==0)
		{
			if(n==0)
			{System.out.println("1");}
			else
			System.out.println("6");}

		else if(n%4==1)
		{System.out.println("8");}
	    
		else if(n%4==2)
		{System.out.println("4");}
	
		else
		{System.out.println("2");}
	}

}
